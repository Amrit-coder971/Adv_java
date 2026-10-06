
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

 
 public class GridLayoutExample {
    public static void main(String[] args) {

                JFrame jFrame = new JFrame("Grid Layout");

                jFrame.setSize(700, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //set layout
                jFrame.setLayout(new GridLayout(3, 2));
                for (int i = 0; i < 6; i++) {
                    JButton button = new JButton("Button " + (i + 1));
                    jFrame.add(button);
                }
                
                jFrame.setVisible(true);
                
         }
    }