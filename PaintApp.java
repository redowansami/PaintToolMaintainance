package edu.cmu.hcii.paint;
import javax.swing.*;

public class PaintApp {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintWindow(800, 600);
            }
        });
        
    }
    
}
