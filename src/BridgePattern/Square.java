package BridgePattern;

import java.awt.*;

public class Square extends Shape{
    Point dimensions;
    public Square(Colour colour){
        super(colour);
    }

    //lite defensive copying för varför inte
    Point getDimensions(){return new Point(dimensions);}
    void setDimensions(int base, int height){this.dimensions.x = base; this.dimensions.y = height;}
}
