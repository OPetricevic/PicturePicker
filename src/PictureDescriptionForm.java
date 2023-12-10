import javax.swing.*;
import java.net.URL;
import java.awt.*;

public class PictureDescriptionForm {
    private JPanel pictureDescriptionPanel;
    private JLabel pictureNameLabel; // Make sure this field exists with this exact name
    private JLabel pictureImgLabel;
    private JTextArea pictureDescriptionTextArea;
    private JTextArea pictureDescriptionTextAreaMain; // This also needs to match exactly
    private JButton backButton;
    private JButton exitButton;

    public PictureDescriptionForm(String imageName, String description) {
        // Assuming the images are placed directly under the 'DescriptionImages' folder in the resources
        URL imageUrl = getClass().getResource("/DescriptionImages/" + imageName);
        if (imageUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            pictureImgLabel.setIcon(imageIcon);
        } else {
            System.err.println("Image not found: " + imageName);
            // Handle the error, for example, by displaying a placeholder image or an error message
        }

        // Set the description text
        pictureDescriptionTextArea.setText(description);
        pictureDescriptionTextArea.setWrapStyleWord(true);
        pictureDescriptionTextArea.setLineWrap(true);
        pictureDescriptionTextArea.setEditable(false);

        // Set up the button actions
        backButton.addActionListener(e -> closeFrame());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void closeFrame() {
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(pictureDescriptionPanel);
        if (topFrame != null) {
            topFrame.dispose();
        }
    }

    public JPanel getPictureDescriptionPanel() {
        return pictureDescriptionPanel;
    }

    private ImageIcon getImageIcon(String imageName) {
        URL imageUrl = PictureDescriptionForm.class.getClassLoader().getResource("DescriptionImages/" + imageName);
        if (imageUrl == null) {
            System.err.println("Resource not found: " + imageName);
            return null;
        }
        return new ImageIcon(imageUrl);
    }

}
