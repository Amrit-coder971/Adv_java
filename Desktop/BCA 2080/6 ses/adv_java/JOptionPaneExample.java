import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");

        JOptionPane.showMessageDialog(null, "Hello " + name);

        int choice = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue?"
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected Yes.");
        } else {
            JOptionPane.showMessageDialog(null, "You selected No.");
        }
    }
}

