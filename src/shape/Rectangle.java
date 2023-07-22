package shape;

public class Rectangle implements Shape{
    private double aSide;
    private double bSide;

    public Rectangle(double a, double b) {
        this.aSide = a;
        this.bSide = b;
    }

    public double getA() {
        return aSide;
    }

    public void setA(double a) {
        this.aSide = a;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    @Override
    public double perimeter() {
        return 2 * (aSide + bSide);
    }

    @Override
    public double area() {
        return aSide * bSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", perimeter=" + this.perimeter() +
                ", area=" + this.area() +
                '}';
    }
};
