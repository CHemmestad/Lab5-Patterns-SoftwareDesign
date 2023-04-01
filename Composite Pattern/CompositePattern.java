public class CompositePattern {
    public static void main(String[] Args) {
        //Creating a new drawing object
        Drawing drawing = new Drawing();

        //Creating a new shape object
        Shape triangle = new Triangle();
        //Adding the object to the array in the drawing object
        drawing.addShape(triangle);
        //Drawing the object
        triangle.draw();

        Shape circle = new Circle();
        drawing.addShape(circle);

        Shape square = new Square();
        drawing.addShape(square);

        //Drawing all the objects in the array in the drawing object
        drawing.draw();

        drawing.removeShape(circle);

        drawing.draw();

        drawing.clear();

        drawing.draw();
    }
}