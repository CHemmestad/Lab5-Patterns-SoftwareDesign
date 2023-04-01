//Creating child class that implements the parent class interface type
public class Triangle implements Shape {
    @Override //Need to use override beacuse the draw() is an abstract function in the parent class
    public void draw() {
        //Telling it what to do when the function is called
        System.out.println("Drawing Triangle...");
    }
}
