package notepad19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class noteView {
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
                    String filename2 = JOptionPane.showInputDialog(null, "vilken fil vill du spara till?");

                }
            }
        }
    }
}