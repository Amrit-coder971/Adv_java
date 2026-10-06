import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Black extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Black Ellipse Example");

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Black());
        frame.setVisible(true);
    }
}


