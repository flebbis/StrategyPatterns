package BridgePattern;

import java.awt.*;

public class Red implements Colour{
    Color color;
    @Override
    public void setColour() {
        color = Color.red;
        System.out.println("color set to red");
    }

    @Override
    public Color getColour() {
        return this.color;
    }
}
