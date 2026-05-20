package edu.cmu.hcii.paint;
import java.awt.*;

public class LinePaint extends PencilPaint {
    public void paint(Graphics2D g) {
        Stroke oldStroke = g.getStroke();
        g.setStroke(new BasicStroke(thickness));
        g.setColor(color);
        g.drawLine((int)getStartX(), (int)getStartY(), (int)getEndX(), (int)getEndY());
        g.setStroke(oldStroke);
    }
}