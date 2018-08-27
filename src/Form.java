import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JButton button1;
    private JPanel mainPanel;
    private JButton updateAppointmentButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton deleteAppointmentButton;
    private JTextArea textArea1;

    public Form() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField1.getText());
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Formsda");
        frame.setContentPane(new Form().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
