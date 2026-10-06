import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class REd extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 200, 200);
        }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Red Rectangle Example");

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new REd());

        frame.setVisible(true);
    }
}