import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

/**
 * Manager class coordinates the operations of the Parcel Collection System.
 * It handles loading customer and parcel data, processing customers, and updating the view.
 */
public class Manager {
    private ParcelView view; // The GUI view for the application
    private QueueOfCustomers queueOfCustomers; // Queue to manage customers
    private ParcelMap parcelMap; // Map to manage parcels
    private Worker worker; // Worker to calculate fees

    /**
     * Constructor to initialize the Manager and set up the application.
     */
    public Manager() {
        this.view = new ParcelView(); 
        this.queueOfCustomers = new QueueOfCustomers(); 
        this.parcelMap = new ParcelMap(); 
        this.worker = new Worker(); 

        // Add action listeners for buttons in the view
        this.view.getLoadButton().addActionListener(e -> loadData("src/Custs.csv","src/Parcels.csv"));
        this.view.getProcessButton().addActionListener(e -> processCustomers());
        Log.getInstance().addEntry("Application started."); // Log application start
    }

    /**
     * Loads customer and parcel data from specified files.
     *
     * @param customerFile the name of the customer file
     * @param parcelFile the name of the parcel file
     */
    private void loadData(String customerFile, String parcelFile) {
        loadCustomers(customerFile); 
        loadParcels(parcelFile); 
    }

    /**
     * Loads customer data from a specified file.
     *
     * @param filename the name of the file containing customer data
     */
    private void loadCustomers(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line; 
            StringBuilder customerData = new StringBuilder(); // StringBuilder to accumulate customer data
            while ((line = br.readLine()) != null) { 
                String[] data = line.split(","); 
                String name = data[0].trim(); 
                String parcelID = data[1].trim(); 
                queueOfCustomers.addCustomer(new Customer(name, parcelID)); 
                customerData.append(name).append(" (Parcel ID: ").append(parcelID).append(")\n"); 
            }
            view.setCustomerData(customerData.toString()); 
            Log.getInstance().addEntry("Customers loaded successfully."); 
        } catch (IOException e) {
            Log.getInstance().addEntry("Error loading customers: " + e.getMessage()); 
            JOptionPane.showMessageDialog(view.getFrame(), "Error loading customers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }

    /**
     * Loads parcel data from a specified file.
     *
     * @param filename the name of the file containing parcel data
     */
    private void loadParcels(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line; 
            StringBuilder parcelData = new StringBuilder(); // StringBuilder to accumulate parcel data
            while ((line = br.readLine()) != null) { 
                String[] data = line.split(","); 
                String parcelID = data[0].trim(); 
                double weight = Double.parseDouble(data[1].trim()); 
                String dimensions = data[2].trim(); 
                int daysInDepot = Integer.parseInt(data[3].trim()); 

                // Create a new Parcel object and add it to the parcel map
                Parcel parcel = new Parcel(parcelID, weight, dimensions, daysInDepot);
                parcelMap.addParcel(parcel);
                parcelData.append(parcelID).append(" (Weight: ").append(weight).append(", Dimensions: ").append(dimensions).append(")\n"); // Append to display data
            }
            view.setParcelData(parcelData.toString()); 
            Log.getInstance().addEntry("Parcels loaded successfully."); // Log successful loading
        } catch (IOException e) {
            Log.getInstance().addEntry("Error loading parcels: " + e.getMessage()); // Log error
            JOptionPane.showMessageDialog(view.getFrame(), "Error loading parcels: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Show error dialog
        } catch (NumberFormatException e) {
            Log.getInstance().addEntry("Error parsing parcel data: " + e.getMessage()); 
            JOptionPane.showMessageDialog(view.getFrame(), "Error parsing parcel data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Show error dialog
        }
    }

    /**
     * Processes customers in the queue and calculates fees for their parcels.
     */
    private void processCustomers() {
        StringBuilder feeData = new StringBuilder(); // StringBuilder to accumulate fee data
        while (!queueOfCustomers.isEmpty()) { 
            Customer customer = queueOfCustomers.removeCustomer(); 
            Parcel parcel = parcelMap.getParcel(customer.getParcelID()); 
            if (parcel != null) { // If the parcel exists
                double fee = worker.calculateFee(parcel); 
                feeData.append("Customer: ").append(customer.getName())
                        .append(", Parcel ID: ").append(parcel.getParcelID())
                        .append(", Fee: ").append(fee).append("\n"); // Append fee information
                Log.getInstance().addEntry("Processed customer: " + customer.getName() + ", Parcel ID: " + parcel.getParcelID() + ", Fee: " + fee); // Log processing
            } else { // If the parcel does not exist
                feeData.append("Customer: ").append(customer.getName())
                        .append(", Parcel ID: ").append(customer.getParcelID())
                        .append(", Fee: Parcel not found\n"); // Append not found message
                Log.getInstance().addEntry("Processed customer: " + customer.getName() + ", Parcel ID: " + customer.getParcelID() + ", Fee: Parcel not found"); 
            }
        }
        view.setFeeData(feeData.toString()); 
    }

    /**
     * Main method to start the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new Manager(); 
    }
}