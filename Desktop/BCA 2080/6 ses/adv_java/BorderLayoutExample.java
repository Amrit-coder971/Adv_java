
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //SET LAYOUT TO BORDERLAYOUT
        frame.setLayout(new BorderLayout());
        // adding Components to the frame
        JButton header = new JButton("Header");
        JButton footer = new JButton("Footer");
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton mainbody = new JButton("main body ");

        frame.add(header, BorderLayout.NORTH);
        frame.add(footer, BorderLayout.SOUTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        
        frame.add(mainbody, BorderLayout.CENTER);


        frame.setVisible(true);
    }

}