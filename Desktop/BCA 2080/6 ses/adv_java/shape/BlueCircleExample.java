import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BlueCircleExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 50, 50);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Blue Circle Example");

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new BlueCircleExample());

        frame.setVisible(true);
    }
}