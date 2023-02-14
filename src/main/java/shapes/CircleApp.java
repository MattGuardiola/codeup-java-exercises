package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.print("What is the radius of the circle in feet:");
        double radius = myInput.getDouble();

        Circle bob = new Circle(radius);


        System.out.println("The area of the circle is " + bob.getArea(radius) + "ft");
        System.out.println("The circumperence of the circle is " + bob.getCircumference(radius) + "ft");

    }


}
