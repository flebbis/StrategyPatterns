package BridgePattern;

public class Circle extends Shape{
    int radius;
    public Circle(Colour colour)
    {
        super(colour);
    }
    void setRadius(int radius){this.radius = radius;}
    int getRadius(){return radius;}
}
