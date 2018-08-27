import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private Integer id;
    private ArrayList<Appointment> appointmentArrayList;
    private List<Animal> animalList;

    public Client(String _name, Integer _id){
        id = _id;
        name = _name;
    }

    public void newAppointment(String date, String animal){
        Appointment appointment(this, animal, date);
        appointmentArrayList.add(appointment);
    }

    public void deleteAppointment(String date){
        for(int i = 0 ; i < appointmentArrayList.size(); i ++){
            if(appointmentArrayList.get(i).getDate().equals(date)){
                appointmentArrayList.remove(i);
                break;
            }
        }
    }

}
