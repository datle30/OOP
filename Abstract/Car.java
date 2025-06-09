public class Car extends Vehicle {
    private int numberOfDoors;
    
    /**
     * Car.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Getter and Setter.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getInfo.
     */
    public String getInfo() {
        return "Car:\n\tBrand: " + getBrand()
                + "\n\tModel: " + getModel()
                + "\n\tRegistration Number: "
                + getRegistrationNumber()
                + "\n\tNumber of Doors: "
                + getNumberOfDoors() + "\n\tBelongs to "
                + getOwner().getName() + " - "
                + getOwner().getAddress();
    }
}
