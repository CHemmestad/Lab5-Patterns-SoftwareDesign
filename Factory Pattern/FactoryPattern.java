public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.start();

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.start();

        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.start();
    }
}