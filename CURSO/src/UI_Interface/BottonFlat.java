package UI_Interface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BottonFlat extends JButton implements MouseListener {

    public BottonFlat(String label) {
        super(label);
        setPersonalitation();
    }

    private void setPersonalitation() {
        addMouseListener((MouseListener) this);
        setOpaque(false);
        setForeground(Color.white);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setHorizontalAlignment(SwingConstants.LEFT);
        setFont(new Font("DejaVu Sans", Font.BOLD | Font.LAYOUT_LEFT_TO_RIGHT, 12));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(Color.BLACK);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
