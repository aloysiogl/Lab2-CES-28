import javax.swing.*;
import java.awt.event.*;

public class Form {
    private JButton createAppointmentButton;
    private JPanel mainPanel;
    private JButton updateAppointmentButton;
    private JTextField textName;
    private JTextField textID;
    private JTextField textPet;
    private JTextField textDate;
    private JButton deleteAppointmentButton;
    private JTextArea textSymptoms;
    static private JFrame frame;

    public Form() {
        //Actions performed when create appointment is clicked
        createAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "create clicked");
            }
        });

        //Actions performed when create appointment is clicked
        updateAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "update clicked");
            }
        });

        //Actions performed when create appointment is clicked
        deleteAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "delete clicked");
            }
        });

        textSymptoms.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                frame.pack();
            }
        });
    }

    public static void main(String[] args){
        frame = new JFrame("Dog mania \uD83D\uDC15");
        frame.setContentPane(new Form().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
