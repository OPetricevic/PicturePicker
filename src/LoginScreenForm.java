import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreenForm {
    public JPanel panel1;
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel welcomeLabel; // Changed from welcomeField to welcomeLabel for clarity
    private JButton loginButton;

    public LoginScreenForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Check if the username and password are correct
                if ("admin".equals(username) && "123".equals(password)) {
                    // If login is successful, show the next part of your application
                    welcomeLabel.setText("Dobrodošli!"); // Set welcome message
                    // You can here call a method that will change the view to the next part of the application
                } else {
                    // If login is unsuccessful, show an option to try again or exit
                    int action = JOptionPane.showConfirmDialog(panel1, "Nepostojeći korisnik. Pokušajte ponovo?", "Greška pri prijavi", JOptionPane.YES_NO_OPTION);
                    if (action == JOptionPane.YES_OPTION) {
                        // User chose to try again, clear the fields for new input
                        usernameField.setText("");
                        passwordField.setText("");
                    } else {
                        // User chose to exit
                        System.exit(0);
                    }
                }
            }
        });
    }
}
