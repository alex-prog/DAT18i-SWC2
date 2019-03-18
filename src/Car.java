public class Car {

    private String brand;
    private double speed;
    private int noOfDoors;

    /**
     * Alin's constructor. <b>This is bold.</b>
     * @param brand
     * @param speed2
     * @param noOfDoors
     */
    public Car(String brand, double speed2, int noOfDoors){
        this.brand = brand;
        speed = speed2;
        this.noOfDoors = noOfDoors;
    }

    public String doDinner() throws Exception{
        int out = 1;

        if(1==1){
        throw new Exception("Just-eat is your friend");
        }
        return "Food is done";
    }
}
