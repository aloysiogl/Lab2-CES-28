import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    private JButton button1;
    private JPanel mainPanel;

    public Formulario() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá mundo  ");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
