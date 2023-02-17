package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1;
        Measurable myShape2;

        myShape1 = new Square(5);
        myShape2 = new Rectangle( 4, 5);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getPerimiter(box1));
//        System.out.println(box1.getArea(box1));
//
//        System.out.println(box2.getPerimiter(box2));
//        System.out.println(box2.getArea(box2));
    }
}
