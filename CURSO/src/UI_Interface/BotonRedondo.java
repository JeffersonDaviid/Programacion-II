package UI_Interface;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

public class BotonRedondo implements Border {

    private int radius;

    BotonRedondo(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }

    // //Crea boton.
    // BotonRedondo myButton = new BotonRedondo("my button");
    // //Define 40 como Radio.
    // myButton.setBorder(new RoundedBorder(40));
}
