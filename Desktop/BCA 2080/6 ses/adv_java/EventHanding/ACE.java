
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ACE   {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Move wala");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("Move me");
        label.setBounds(100, 100, 100, 30);

        frame.setVisible(true);
        frame.add(label);

        label.addKeyListener(new keyAdapter() {
        
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                int x = label.getX();
                int y = label.getY();
                System.out.println("Key Pressed: " + keyCode);
                if (keyCode == KeyEvent.VK_UP) {
                    y -= 10;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    y += 10;
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    x -= 10;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    x += 10;
                }
                label.setLocation(x, y);
            }

           
        });
        label.setFocusable(true);

    }

}