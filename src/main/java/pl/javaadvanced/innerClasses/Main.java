package pl.javaadvanced.innerClasses;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Zabawka");
        final Vehicle.VehicleType vehicleType = vehicle.new VehicleType("Samochodzik");

        System.out.println(vehicleType.getVehicleType());
    }
}
