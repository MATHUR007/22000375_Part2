

public class Parcel {
    private String parcelid;
    private int days_in_depot;
    private double weight;
    private Dimensions dimensions;
    private String Status;
    private double discount;


    public class Dimensions{
        private double length;
        private double width;
        private double height;

        public Dimensions(double length,double width,double height) {
            this.length = length;
            this.width=width;
            this.height=height;
        }

        public double calculateVolume() {
            return length * width * height;
        }
    }

    //constructor
    public Parcel(String ID,int did,double weight,Dimensions dimensions,double discount){
    this.parcelid=ID;
    this.days_in_depot=did;
    this.weight=weight;
    this.dimensions=dimensions;
    this.Status="waiting";
    this.discount=discount;
    }

    //method1-getID
    public String getID() {
        return parcelid;
    }

    //method2-daysindepot
    public int getdays_in_depot() {return days_in_depot;}

    //method3-dimensions
    public double calculateVolume() {
        return dimensions.calculateVolume();
    }

    //method4-weight
    public double getWeight() {return weight;}

}




