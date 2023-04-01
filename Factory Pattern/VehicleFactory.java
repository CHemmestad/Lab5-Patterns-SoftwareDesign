public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        //Creating a new object based on the type of vehicle you want
        switch(type) {
            case "car" :
                return new Car();
            case "truck" :
                return new Truck();
            case "motorcycle" :
                return new Motorcycle();
            default :
                return null;
        }
    }
}
