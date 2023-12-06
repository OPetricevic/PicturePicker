import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Use the event dispatch thread to build the UI for thread-safety.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create the frame that will contain our JPanel
                JFrame frame = new JFrame("LoginScreen");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create an instance of the LoginScreenForm.
                LoginScreenForm loginScreenForm = new LoginScreenForm();

                // Add the panel from LoginScreenForm to the frame.
                frame.setContentPane(loginScreenForm.panel1);

                // Set the size of the frame based on the contents.
                frame.pack();

                // Center the frame on the screen.
                frame.setLocationRelativeTo(null);

                // Make the frame visible.
                frame.setVisible(true);
            }
        });
    }
}
