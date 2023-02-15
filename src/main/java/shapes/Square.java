package shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }


    public double getArea(double side) {
        return side * side;
    }


    public double getPerimiter(double side) {
        return side * 4;
    }
}
