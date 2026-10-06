import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");

        String[] courses = {"BCA", "BIM", "BBS", "CSIT"};

        JComboBox<String> comboBox = new JComboBox<>(courses);
        comboBox.setBounds(50, 50, 150, 30);

        frame.add(comboBox);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}