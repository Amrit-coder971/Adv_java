
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectangleExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2d = (Graphics) g;
        g2d.drawRect(100, 100, 50, 50);  
        g2d.fillRect(100, 100, 200, 200);  

         }
   
   public static void main(String[] args) {
        JFrame Frame = new JFrame("Rectangle Example");
        Frame.setSize(700, 600);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.add(new RectangleExample());
        Frame.setVisible(true);
    }
    
}