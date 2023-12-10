import javax.swing.*;
import java.net.URL;
import java.awt.*;

public class PicturePickerForm {
    private JPanel picturePickerField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public PicturePickerForm() {
        button1.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle1.jpeg", "Description for Image 1"));
        button2.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle2.jpeg", "Description for Image 2"));
        button3.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle3.jpeg", "Description for Image 3"));
        button4.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle4.jpeg", "Description for Image 4"));
        button5.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle5.jpeg", "Description for Image 5"));
        button6.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle6.jpeg", "Description for Image 6"));
        button7.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle7.jpeg", "Description for Image 7"));
        button8.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle8.jpeg", "Description for Image 8"));
        button9.addActionListener(e -> openPictureDescriptionForm("heSpokeStyle9.jpeg", "Description for Image 9"));
    }


    private void openPictureDescriptionForm(String imageName, String description) {
        PictureDescriptionForm descriptionForm = new PictureDescriptionForm(imageName, description);
        JFrame frame = new JFrame("Picture Description");
        frame.setContentPane(descriptionForm.getPictureDescriptionPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel getPicturePickerField() {
        return picturePickerField;
    }

    private ImageIcon getScaledImageIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/" + path));
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
