package shape;

public class Circle extends Shape{
   private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double countPerimeter() {
       return 2*r*Math.PI;
    }

    @Override
    public double countArea() {
      return r*r*Math.PI;
    }
}
