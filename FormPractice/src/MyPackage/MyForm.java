package MyPackage;

import javax.swing.*;

public class MyForm {

//    private JPanel bg; // Create panel variable, acts as background
//    private JLabel hello; // Create label variable, outputs text
    private JPanel panel1;
    private JLabel title1;

    public MyForm(){
        panel1 = new JPanel();

        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Create a new frame object
        frame.setContentPane(new MyForm().panel1); // This is the content of the form
        frame.pack(); // Display the whole pack
        frame.setVisible(true); // Everything written is to be displayed
    }

}


