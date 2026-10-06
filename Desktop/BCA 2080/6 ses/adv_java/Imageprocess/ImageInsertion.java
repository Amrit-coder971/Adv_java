
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ImageInsertion {
    public static void main(String[] args) {
          JFrame Frame = new JFrame("Image Insertion Example");

        Frame.setSize(700, 600);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon imageIcon = new ImageIcon("ZTH.png");
        JLabel label = new JLabel(imageIcon);
        Frame.add(label);
        Frame.setVisible(true);     
    }  
}
