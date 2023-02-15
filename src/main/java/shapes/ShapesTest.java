package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);

        System.out.println(box1.getPerimiter(box1));
        System.out.println(box1.getArea(box1));

        System.out.println(box2.getPerimiter(box2));
        System.out.println(box2.getArea(box2));
    }
}
