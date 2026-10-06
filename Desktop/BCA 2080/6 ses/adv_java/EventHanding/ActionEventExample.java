
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;




public  class ActionEventExample {
    public static void main(String[] args) {
      
                JFrame jFrame = new JFrame("Grid Layout");

                jFrame.setSize(700, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                jFrame.setLayout(new FlowLayout());

                JButton button = new JButton("click me");
                jFrame.add(button);

                // add event handing in button component
                button.addActionListener( new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Button clicked");
                    }
                });

                jFrame.setVisible(true);


    }
}