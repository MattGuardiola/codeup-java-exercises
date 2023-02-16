package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
//
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(Rectangle rectangle) {
//        return this.length * this.width;
//    }
//
//    public double getPerimiter (Rectangle rectangle) {
//        return (this.length * 2) + (this.width * 2 );
//    }

}
