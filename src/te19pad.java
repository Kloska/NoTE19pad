import javax.swing.*;

public class te19pad extends JFrame {
    private JPanel mainPanel;
    private JPanel panel1;
    private JTextPane textPane1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("te19pad");
        frame.setContentPane(new te19pad().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
