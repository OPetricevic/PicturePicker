import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("LoginScreen");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                LoginScreenForm loginScreenForm = new LoginScreenForm();

                frame.setContentPane(loginScreenForm.panel1);

                frame.pack();

                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
            }
        });
    }
}
