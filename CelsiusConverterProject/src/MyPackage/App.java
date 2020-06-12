package MyPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    JFrame f;
    private JButton btnMSG;
    private JPanel panelMain;

    public App() {
        panelMain = new JPanel();
        btnMSG = new JButton("Click Me");
        panelMain.add(btnMSG);
        btnMSG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Hello World!");
            }
        });

       }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
