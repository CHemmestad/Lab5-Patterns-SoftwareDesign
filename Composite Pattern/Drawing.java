import java.util.ArrayList;

//Creating child class that implements the parent class interface type
public class Drawing implements Shape {
    //Creating a Shape type array to store all the shapes
    private ArrayList<Shape> shapes = new ArrayList<>();

    @Override //This is the abstract function that comes with the parent class
    public void draw() {
        //The draw function will go through all the objects in the array and execute their draw functions
        for( Shape shape : shapes) {
            shape.draw();
        }
    }

    //Precondition : Need a way to add objects to the array
    //Postcondition : Adds objects to the array
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    //Precondition : Need a way to delete objects from the array
    //Postcondition : Deletes objects from the array
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    //Precondition : Want to clear all objects in the array
    //Postcondition : Clears all objects in the array
    public void clear() {
        shapes.clear();
    }
}
