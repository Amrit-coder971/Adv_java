import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class GuiComponents {
    public static void main(String[] args) {
        // 1. Creating JFrame
        JFrame jFrame = new JFrame("GUI Components");

        // 2. Set Default size
        jFrame.setSize(1000, 1200);

        // 3. Close Operation
        // jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //termination

        // jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //disabled

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit -> running

        // 3. Set Layout
        jFrame.setLayout(null);

        // 4. Add Button Component
        // JButton

        // JButton firstButton = new JButton("First Button");
        // firstButton.setBounds(100, 200, 150, 80);
        // jFrame.add(firstButton);

        // JButton secondButton = new JButton("Second Button");
        // secondButton.setBounds(100, 300, 150, 80);
        // jFrame.add(secondButton);

        // JButton thirdButton = new JButton("Third Button");
        // thirdButton.setBounds(100, 400, 150, 80);
        // jFrame.add(thirdButton);

        // Radio Button
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100, 560, 100, 50);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(100, 600, 100, 50);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        jFrame.add(male);
        jFrame.add(female);

        // 5. Create Checkbox
        JLabel checkBoxJLabel = new JLabel("Course Title:");
        checkBoxJLabel.setBounds(400, 370, 150, 80);
        JCheckBox cricket = new JCheckBox("Ds");
        cricket.setBounds(400, 400, 150, 80);
        JCheckBox volleyball = new JCheckBox("Adv .Java");
        volleyball.setBounds(500, 400, 150, 80);
        JCheckBox football = new JCheckBox("Mp");
        football.setBounds(600, 400, 150, 80);
        JCheckBox basketball = new JCheckBox("Np");
        basketball.setBounds(700, 400, 150, 80);

        jFrame.add(checkBoxJLabel);
        jFrame.add(cricket);
        jFrame.add(volleyball);
        jFrame.add(football);
        jFrame.add(basketball);

        // // JLabel

        // JLabel firstLabel = new JLabel("this is label");
        // firstLabel.setBounds(300, 200, 200, 30);
        // jFrame.add(firstLabel);

        // // JTextArea

        // JTextArea firstTextArea = new JTextArea("Type here...");
        // firstTextArea.setLineWrap(true);
        // firstTextArea.setWrapStyleWord(true);
        // firstTextArea.setBounds(300, 250, 200, 80);
        // jFrame.add(firstTextArea);

        // // JPasswordField

        // JPasswordField passwordField = new JPasswordField();
        // passwordField.setBounds(300, 350, 200, 30);
        // jFrame.add(passwordField);

        // // JTextField

        // JTextField textField = new JTextField();
        // textField.setBounds(300, 400, 200, 30);
        // jFrame.add(textField);

        // // JSlider

        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(300, 600, 250, 60);
        jFrame.add(slider);


        // Set Visibility
        jFrame.setVisible(true);
    }
}
