import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // First number
        JLabel label1 = new JLabel("First Number");
        label1.setBounds(50, 0, 150, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 50, 150, 30);
        frame.add(textField1);

        // Second number
        JLabel label2 = new JLabel("Second Number");
        label2.setBounds(250, 0, 150, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(250, 50, 150, 30);
        frame.add(textField2);

        // Add button
        JButton add = new JButton("Add");
        add.setBounds(50, 100, 100, 50);
        frame.add(add);

        // Subtract button
        JButton sub = new JButton("Subtract");
        sub.setBounds(250, 100, 100, 50);
        frame.add(sub);

        // Result
        JLabel result = new JLabel("Result:");
        result.setBounds(50, 200, 250, 30);
        frame.add(result);

        // Add operation
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());

                int output = a + b;

                result.setText("Result: " + output);

                System.out.println(output);
            }
        });

        // Subtract operation
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());

                int output = a - b;

                result.setText("Result: " + output);

                System.out.println(output);
            }
        });

        frame.setVisible(true);
    }
}