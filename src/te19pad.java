import javax.swing.*;

public class te19pad extends JFrame {
    private JPanel mainPanel;
    private JPanel panel1;
    private JButton öppnaFil;
    private JButton Spara;
    private JButton nyFil;
    private JPanel NoTE19pad;
    private JTextPane textPane1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("te19pad");
        frame.setContentPane(new te19pad().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
