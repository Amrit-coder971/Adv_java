
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame  frame = new JFrame("flow layout example");
        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // frame.setLayout(new FlowLayout());//center alignment
        // frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));


        JButton firstbutton = new JButton("first Button ");
        JButton secondbutton = new JButton("second Button ");
        JButton thirdbutton = new JButton("third Button ");
        JButton fourthbutton = new JButton("fourth Button ");

        frame.add(firstbutton);
        frame.add(secondbutton);
        frame.add(thirdbutton);
        frame.add(fourthbutton);




        frame.setVisible(true);
        
    }
        
}