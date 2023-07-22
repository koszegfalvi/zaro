package shape;

public class Square extends Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double countPerimeter() {
        return 4 * a;
    }

    @Override
    public double countArea() {
        return a * a;
    }
}
