package shape;

public class ShapeManager {
    public static void main(String[] args) {
        Square sqr = new Square(3.5);
        Rectangle rct = new Rectangle(3, 7);
        Circle crcl = new Circle(6);

        System.out.println(sqr);
        System.out.println(rct);
        System.out.println(crcl);
    }
}
