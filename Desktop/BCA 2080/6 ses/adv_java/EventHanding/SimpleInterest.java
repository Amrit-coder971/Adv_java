import java.awt.event.*;
import javax.swing.*;

public class SimpleInterest {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel pLabel = new JLabel("Principal");
        pLabel.setBounds(50, 80, 100, 30);
        frame.add(pLabel);

        JTextField pText = new JTextField();
        pText.setBounds(50, 115, 150, 30);
        frame.add(pText);

        JLabel rLabel = new JLabel("Rate");
        rLabel.setBounds(270, 80, 100, 30);
        frame.add(rLabel);

        JTextField rText = new JTextField();
        rText.setBounds(270, 115, 150, 30);
        frame.add(rText);

        
        JLabel tLabel = new JLabel("Time");
        tLabel.setBounds(490, 80, 100, 30);
        frame.add(tLabel);

        JTextField tText = new JTextField();
        tText.setBounds(490, 115, 150, 30);
        frame.add(tText);

        
        JButton siButton = new JButton("SI");
        siButton.setBounds(150, 220, 150, 40);
        frame.add(siButton);

        
        JButton ciButton = new JButton("CI");
        ciButton.setBounds(400, 220, 150, 40);
        frame.add(ciButton);

        siButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {

                double P = Double.parseDouble(pText.getText());
                double R = Double.parseDouble(rText.getText());
                double T = Double.parseDouble(tText.getText());

                double SI = (P * R * T) / 100;

                JOptionPane.showMessageDialog(
                    frame,
                    "Simple Interest = " + SI
                );
            }
        });

        ciButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {

                double P = Double.parseDouble(pText.getText());
                double R = Double.parseDouble(rText.getText());
                double T = Double.parseDouble(tText.getText());

                double CI = P * Math.pow(1 + R / 100, T) - P;

                JOptionPane.showMessageDialog(
                    frame,
                    "Compound Interest = " + CI
                );
            }
        });

        frame.setVisible(true);
    }
}