public class Worker {

    /**
     * Calculates the fee for a given parcel based on its weight.
     * If the parcel ID ends with '6', a discount is applied.
     *
     * @param parcel the parcel for which to calculate the fee
     * @return the calculated fee after applying any discounts
     */
    public double calculateFee(Parcel parcel) {
        double baseFee = 5.0; 
        double weightFee = parcel.getWeight() * 0.5; 
        double totalFee = baseFee + weightFee;

        // Apply a 10% discount on parcelID ending with "6"
        if (parcel.getParcelID().endsWith("6")) {
            double discount = totalFee * 0.10; 
            totalFee -= discount;
        }

        return totalFee;
    }
}