package pl.javaadvanced.innerClasses;

public class Vehicle {
    private String name;
    private VehicleType vehicleType;

    public Vehicle(String name) {
        this.name = name;
    }

    class VehicleType {
        //z klasy wewnętrznej mamy dostęp do wszystkich pól i metod klasy zewnętrznej także tych prywatnych
        private String vehicleType;

        public VehicleType(String vehicleType) {
             this.vehicleType = vehicleType;
        }

        public String getVehicleType() {
             return vehicleType;
        }
    }
}
