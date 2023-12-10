import javax.swing.*;

public class ProgressFurtherForm {
    private JPanel progressPanel;
    private JButton exitButton;
    private JButton proceedFurther;

    public ProgressFurtherForm() {
        // Initialize action listeners for your buttons
        exitButton.addActionListener(e -> System.exit(0));

        proceedFurther.addActionListener(e -> {
            // Hide the current window
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(progressPanel);
            topFrame.dispose(); // Dispose the current frame

            // Create and show the PicturePickerForm
            PicturePickerForm picturePickerForm = new PicturePickerForm();
            JFrame picturePickerFrame = new JFrame("Select a Picture");
            picturePickerFrame.setContentPane(picturePickerForm.getPicturePickerField());
            picturePickerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            picturePickerFrame.pack();
            picturePickerFrame.setLocationRelativeTo(null);
            picturePickerFrame.setVisible(true);
        });
    }

    public JPanel getProgressPanel() {
        return progressPanel;
    }
}
