package com.OmarPetricevic.example;

import javax.swing.*;
import java.net.URL;

public class PictureDescriptionForm {
    private JPanel pictureDescriptionPanel;
    private JLabel pictureImgLabel;
    private JLabel pictureLabel;
    private JTextArea pictureDescriptionTextArea;
    private JButton backButton;
    private JButton exitButton;
    private JTextArea pictureStyleOptionTextArea;
    private JLabel pictureNameLabel;

    public PictureDescriptionForm(String imageName, String description, String styleOptionDescription) {
        // Assuming the images are placed directly under the 'DescriptionImages' folder in the resources
        URL imageUrl = getClass().getResource("/DescriptionImages/" + imageName);
        if (imageUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            pictureImgLabel.setIcon(imageIcon);
        } else {
            System.err.println("Image not found: " + imageName);
        }

        // Set the description text
        pictureDescriptionTextArea.setText(description);
        pictureDescriptionTextArea.setWrapStyleWord(true);
        pictureDescriptionTextArea.setLineWrap(true);
        pictureDescriptionTextArea.setEditable(false);

        pictureStyleOptionTextArea.setText(styleOptionDescription);
        pictureStyleOptionTextArea.setWrapStyleWord(true);
        pictureStyleOptionTextArea.setLineWrap(true);
        pictureStyleOptionTextArea.setEditable(false);

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
