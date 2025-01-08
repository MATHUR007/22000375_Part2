public class Parcel {
    private String parcelID;      
    private double weight;        
    private String dimensions;    
    private int daysInDepot;      

    /**
     * Constructs a new Parcel with the specified details.
     *
     * @param parcelID     the unique identifier for the parcel
     * @param weight       the weight of the parcel
     * @param dimensions   the dimensions of the parcel
     * @param daysInDepot  the number of days the parcel has been in the depot
     */
    public Parcel(String parcelID, double weight, String dimensions, int daysInDepot) {
        this.parcelID = parcelID;
        this.weight = weight;
        this.dimensions = dimensions;
        this.daysInDepot = daysInDepot;
    }

    /**
     * Gets the unique identifier of the parcel.
     *
     * @return the parcel ID
     */
    public String getParcelID() {
        return parcelID;
    }

    /**
     * Sets the unique identifier of the parcel.
     *
     * @param parcelID the new parcel ID
     */
    public void setParcelID(String parcelID) {
        this.parcelID = parcelID;
    }

    /**
     * Gets the weight of the parcel.
     *
     * @return the weight of the parcel
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the parcel.
     *
     * @param weight the new weight of the parcel
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the dimensions of the parcel.
     *
     * @return the dimensions of the parcel
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Sets the dimensions of the parcel.
     *
     * @param dimensions the new dimensions of the parcel
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Gets the number of days the parcel has been in the depot.
     *
     * @return the number of days in depot
     */
    public int getDaysInDepot() {
        return daysInDepot;
    }

    /**
     * Sets the number of days the parcel has been in the depot.
     *
     * @param daysInDepot the new number of days in depot
     */
    public void setDaysInDepot(int daysInDepot) {
        this.daysInDepot = daysInDepot;
    }

    /**
     * Returns a string representation of the parcel, useful for debugging and logging.
     *
     * @return a string containing the parcel's details
     */
    @Override
    public String toString() {
        return "ParcelID: " + parcelID + ", Weight: " + weight + ", Dimensions: " + dimensions + ", Days in Depot: " + daysInDepot;
    }
}