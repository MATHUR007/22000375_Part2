import java.awt.*;
import javax.swing.*;

/**
 * ParcelView class represents the graphical user interface (GUI) for the Parcel Collection System.
 * It displays customer data, parcel data, and fee information, and provides buttons for loading data
 * and processing customers.
 */
public class ParcelView {
    private JFrame frame; 
    private JTextArea customerArea; 
    private JTextArea parcelArea; 
    private JTextArea feeArea; 
    private JButton loadButton; 
    private JButton processButton; 

    /**
     * Constructor to initialize the ParcelView and set up the GUI.
     */
    public ParcelView() {
        initializeGUI();
    }

    /**
     * Initializes the graphical user interface components.
     */
    private void initializeGUI() {
        frame = new JFrame("Parcel Collection System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(800, 600); 
        frame.setLayout(new BorderLayout()); 

        // Create and configure the title label
        JLabel titleLabel = new JLabel("Parcel Collection System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); 
        frame.add(titleLabel, BorderLayout.NORTH); 

        // Initialize text areas for displaying data
        customerArea = new JTextArea();
        parcelArea = new JTextArea();
        feeArea = new JTextArea();
        customerArea.setEditable(false); 
        parcelArea.setEditable(false); 
        feeArea.setEditable(false); 

        // Create a panel to hold the text areas in a grid layout
        JPanel textAreaPanel = new JPanel(new GridLayout(1, 3));
        textAreaPanel.add(createLabeledScrollPane("Customers", customerArea)); 
        textAreaPanel.add(createLabeledScrollPane("Parcels", parcelArea)); 
        textAreaPanel.add(createLabeledScrollPane("Fees", feeArea)); 
        frame.add(textAreaPanel, BorderLayout.CENTER); 

        // Initialize buttons for loading data and processing customers
        loadButton = new JButton("Load Data");
        processButton = new JButton("Process Customers");

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loadButton); 
        buttonPanel.add(processButton); 
        frame.add(buttonPanel, BorderLayout.SOUTH); 

        frame.setVisible(true); 
    }

    /**
     * Creates a labeled scroll pane containing a text area.
     *
     * @param labelText the text for the label
     * @param textArea the text area to be added to the scroll pane
     * @return a JPanel containing the label and scroll pane
     */
    private JPanel createLabeledScrollPane(String labelText, JTextArea textArea) {
        JPanel panel = new JPanel(new BorderLayout()); 
        JLabel label = new JLabel(labelText); 
        label.setHorizontalAlignment(SwingConstants.CENTER); 
        panel.add(label, BorderLayout.NORTH); 
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER); 
        return panel; 
    }

    /**
     * Sets the customer data to be displayed in the customer text area.
     *
     * @param data the customer data to display
     */
    public void setCustomerData(String data) {
        customerArea.setText(data); 
    }

    /**
     * Sets the parcel data to be displayed in the parcel text area.
     *
     * @param data the parcel data to display
     */
    public void setParcelData(String data) {
        parcelArea.setText(data); 
    }

    /**
     * Sets the fee data to be displayed in the fee text area.
     *
     * @param data the fee data to display
     */
    public void setFeeData(String data) {
        feeArea.setText(data); 
    }

    /**
     * Gets the load button for loading data.
     *
     * @return the load button
     */
    public JButton getLoadButton() {
        return loadButton; 
    }

    /**
     * Gets the process button for processing customers.
     *
     * @return the process button
     */
    public JButton getProcessButton() {
        return processButton; 
    }

    /**
     * Gets the main frame of the application.
     *
     * @return the main frame
     */
    public JFrame getFrame() {
        return frame; 
    }
}