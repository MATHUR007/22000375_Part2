/**
 * Represents a customer with their details such as name and associated parcel ID.
 */
public class Customer {
    private String name;      
    private String parcelID;  

    /**
     * Constructs a new Customer with the specified name and parcel ID.
     *
     * @param name      the name of the customer
     * @param parcelID  the unique identifier for the associated parcel
     */
    public Customer(String name, String parcelID) {
        this.name = name;
        this.parcelID = parcelID;
    }

    /**
     * Gets the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the customer.
     *
     * @param name the new name of the customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the unique identifier of the associated parcel.
     *
     * @return the parcel ID
     */
    public String getParcelID() {
        return parcelID;
    }

    /**
     * Sets the unique identifier of the associated parcel.
     *
     * @param parcelID the new parcel ID
     */
    public void setParcelID(String parcelID) {
        this.parcelID = parcelID;
    }

    /**
     * Returns a string representation of the customer, useful for debugging and logging.
     *
     * @return a string containing the customer's details
     */
    @Override
    public String toString() {
        return "Customer{" +
               "name='" + name + '\'' +
               ", parcelID='" + parcelID + '\'' +
               '}';
    }
}