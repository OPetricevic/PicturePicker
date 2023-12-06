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

                if ("admin".equals(username) && "123".equals(password)) {
                    // Uspješna prijava, prelazak na sljedeći dio aplikacije
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
