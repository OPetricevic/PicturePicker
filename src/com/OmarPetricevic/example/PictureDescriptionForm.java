package com.OmarPetricevic.example;

import javax.swing.*;
import java.net.URL;

public class PictureDescriptionForm {
    private JPanel pictureDescriptionPanel;
    private JLabel pictureImgLabel;
    private JTextArea pictureDescriptionTextArea;
    private JButton backButton;
    private JButton exitButton;
    private JTextArea pictureStyleOptionTextArea;
    private JLabel pictureNameLabel;

    public PictureDescriptionForm(String imageName, String description, String styleOptionDescription) {
        URL imageUrl = getClass().getResource("/DescriptionImages/" + imageName);
        if (imageUrl != null) {
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            pictureImgLabel.setIcon(imageIcon);
        } else {
            System.err.println("Image not found: " + imageName);
        }

        pictureDescriptionTextArea.setText(description);
        pictureDescriptionTextArea.setWrapStyleWord(true);
        pictureDescriptionTextArea.setLineWrap(true);
        pictureDescriptionTextArea.setEditable(false);

        pictureStyleOptionTextArea.setText(styleOptionDescription);
        pictureStyleOptionTextArea.setWrapStyleWord(true);
        pictureStyleOptionTextArea.setLineWrap(true);
        pictureStyleOptionTextArea.setEditable(false);

        backButton.addActionListener(e -> {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(pictureDescriptionPanel);
            if (topFrame != null) {
                topFrame.dispose();
            }
            // Here you can create a new instance of PicturePickerForm and make it visible again
            PicturePickerForm picturePickerForm = new PicturePickerForm();
            JFrame pickerFrame = new JFrame("Select a Picture");
            pickerFrame.setContentPane(picturePickerForm.getPicturePickerField());
            pickerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pickerFrame.pack();
            pickerFrame.setLocationRelativeTo(null);
            pickerFrame.setVisible(true);
        });
        exitButton.addActionListener(e -> System.exit(0));
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
