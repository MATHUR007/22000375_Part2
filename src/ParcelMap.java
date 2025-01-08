import java.util.HashMap;

/**
 * Class representing a map of parcels.
 * This class provides methods to add and retrieve parcels by their ID.
 */
public class ParcelMap {
    private HashMap<String, Parcel> parcels;

    /**
     * Constructs a ParcelMap instance.
     */
    public ParcelMap() {
        parcels = new HashMap<>();
    }

    /**
     * Adds a parcel to the map.
     *
     * @param parcel the parcel to be added
     */
    public void addParcel(Parcel parcel) {
        parcels.put(parcel.getParcelID(), parcel);
    }

    /**
     * Retrieves a parcel by its ID.
     *
     * @param parcelID the ID of the parcel to retrieve
     * @return the parcel with the specified ID, or null if not found
     */
    public Parcel getParcel(String parcelID) {
        return parcels.get(parcelID);
    }

    /**
     * Returns a string representation of all parcels in the map.
     *
     * @return a string containing all parcels
     */
    @Override
    public String toString() {
        return parcels.values().toString();
    }
}