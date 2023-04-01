//Creating child class that implements the parent class interface type
public class Car implements Vehicle {
    @Override //Override because the start function is abstract
    public void start() {
        //Telling it what to do when the start function is called for this specific type of object
        System.out.println("Starting car... vroom vroom");
    }
}
