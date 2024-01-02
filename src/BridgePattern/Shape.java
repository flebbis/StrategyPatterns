package BridgePattern;

import java.awt.*;

public abstract class Shape {
    protected Colour col;
    protected Shape(Colour colour){
        this.col = colour;
    }

}
