import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class  MouseEventExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Move");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                System.out.println("Mouse Clicked");
                System.out.println("X = " + x);
                System.out.println("Y = " + y);
            }

            public void mousePressed(MouseEvent e) {
                
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        frame.setVisible(true);
    }
}