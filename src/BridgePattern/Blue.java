package BridgePattern;

import java.awt.*;

public class Blue implements Colour{
    Color color = Color.blue;
    @Override
    public void setColour() {
        System.out.println("color set to blue");
    }

    @Override
    public Color getColour() {
    return this.color;
    }
}
