import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Getter and Setter.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * addVehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicleList.add(vehicle);
        }
    }

    /**
     * removeVehicle.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    /**
     * getVehiclesInfo.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return this.getName() + " has no vehicle!";
        }
        String temp = this.getName() + " has:\n";
        for (Vehicle vehicle : vehicleList) {
            temp += "\n" + vehicle.getInfo();
        }
        return temp;
    }
}
