import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    private ArrayList<Client> clientArrayList;

    private Form() {
        //Actions performed when create appointment is clicked
        createAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Client newClient = new Client(textName.getText(), Integer.parseInt(textID.getText()));
                    newClient = Client.addClient(newClient);
                    boolean success = newClient.newAppointment(textDate.getText(), textPet.getText(), textSymptoms.getText());

                    if (success)
                        JOptionPane.showMessageDialog(null, "Appointment created");
                    else
                        JOptionPane.showMessageDialog(null, "Appointment already exists");
                } catch (NumberFormatException except){
                    JOptionPane.showMessageDialog(null, "Invalid ID format");
                } catch (Exception except) {
                    JOptionPane.showMessageDialog(null, except.getMessage());
                }
            }
        });

        //Actions performed when create appointment is clicked
        updateAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Appointment toUpdate = getAppointment(Integer.parseInt(textID.getText()), textPet.getText(), textDate.getText());

                    if (toUpdate == null)
                        JOptionPane.showMessageDialog(null, "No such appointment");
                    else {
                        toUpdate.setSymptoms(textSymptoms.getText());
                        JOptionPane.showMessageDialog(null, "Update successful");
                    }
                } catch (Exception except){
                    JOptionPane.showMessageDialog(null, "No such appointment");
                }
            }
        });

        //Actions performed when create appointment is clicked
        deleteAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Appointment toDelete = getAppointment(Integer.parseInt(textID.getText()), textPet.getText(), textDate.getText());

                if (toDelete == null)
                    JOptionPane.showMessageDialog(null, "No such appointment");
                else {
                    for (Client client: Client.getClientsList()){
                        if (Integer.parseInt(textID.getText()) == client.getId()){
                            client.deleteAppointment(toDelete.getDate());
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Delete successful");
                }
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

    Appointment getAppointment(Integer id, String animal, String date){
        for (Client client: Client.getClientsList()) {
            if (client.getId().equals(id)) {
                for (Appointment appointment: client.getAppointmentArrayList()){
                    if (appointment.getDate().equals(date) && appointment.getAnimal().getName().equals(animal)) {
                        return appointment;
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args){
        frame = new JFrame("Dog mania \uD83D\uDC15");
        frame.setContentPane(new Form().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
