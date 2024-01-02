package BridgePattern;

public class Client {
    public static void main(String[] args) {
        Blue blue = new Blue();
        Circle circle = new Circle(blue);
        circle.col.setColour();
        circle.col.getColour();
        Red red = new Red();
        Square square = new Square(red);
        square.col.setColour();
    }
}
