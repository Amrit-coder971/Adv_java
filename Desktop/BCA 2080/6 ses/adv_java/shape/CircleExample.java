
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CircleExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       Graphics g2d = (Graphics) g;

        // g2d.drawOval(100, 100, 200, 200);
    }


    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Circle Example");

        jFrame.setSize(700, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(new CircleExample());

        

        jFrame.setVisible(true);
           
        
    }
}

