import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class te19pad extends JFrame {
    private JPanel mainPanel;
    private JPanel panel1;
    private JButton öppnaFil;
    private JButton Spara;
    private JButton nyFil;
    private JPanel NoTE19pad;
    private JEditorPane editorPane1;

    public te19pad() {
        öppnaFil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        Spara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editorPane1.getText();
                String text = editorPane1.getText();
                PrintWriter spara = new PrintWriter
                        (new BufferedWriter
                        (new OutputStreamWriter)
                (new FileOutputStream("testfil.txt"),"UTF-8")));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("te19pad");
        frame.setContentPane(new te19pad().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
