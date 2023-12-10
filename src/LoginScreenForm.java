import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreenForm {
    public JPanel panel1;
    private JLabel passwordLabel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel welcomeLabel;
    private JButton loginButton;

    public LoginScreenForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if ("admin".equals(username) && "123".equals(password)) {
                    // Hide the login window
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
                    topFrame.dispose(); // Dispose the current frame

                    // Open the ProgressFurtherForm
                    ProgressFurtherForm progressForm = new ProgressFurtherForm();
                    JFrame progressFrame = new JFrame("Dobrodošli u MOJORMAR");
                    progressFrame.setContentPane(progressForm.getProgressPanel());
                    progressFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    progressFrame.pack();
                    progressFrame.setLocationRelativeTo(null);
                    progressFrame.setVisible(true);
                } else {
                    // Prikazujemo JOptionPane s opcijama "Pokušaj ponovo" i "Izađi"
                    int option = JOptionPane.showOptionDialog(
                            null,
                            "Neispravno korisničko ime ili lozinka. Pokušajte ponovo.",
                            "Pogreška pri prijavi",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.ERROR_MESSAGE,
                            null,
                            new String[]{"Pokušaj ponovo", "Izađi"}, // opcije
                            "Pokušaj ponovo" // default izbor
                    );

                    if (option == JOptionPane.YES_OPTION) {
                        // Korisnik je odabrao "Pokušaj ponovo", očistimo polja za unos
                        usernameField.setText("");
                        passwordField.setText("");
                    } else {
                        // Korisnik je odabrao "Izađi", zatvaramo aplikaciju
                        System.exit(0);
                    }
                }
            }
        });
    }
}
