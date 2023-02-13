package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println("What is the radius of the circle in feet");
        double radius = myInput.getDouble();

        Circle bob = new Circle(radius);


        System.out.println(bob.getArea(radius));
        System.out.println(bob.getCircumference(radius));

    }


}
