import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
    private String name;
    private Integer id;
    private ArrayList<Appointment> appointmentArrayList;
    private List<Animal> animalList = new ArrayList<>();
    private static ArrayList<Client> clientArrayList = new ArrayList<>();

    public Client(String _name, Integer _id) {
        id = _id;
        name = _name;
        appointmentArrayList = new ArrayList<>();
        animalList = new LinkedList<>();
    }

    public void newAppointment(String date, String animal) {
        boolean hasAnimal = false;
        Animal animalObject = null;
        System.out.println("aqui1");

        for (Animal anAnimal : animalList) {
            if (animal.equals(anAnimal.getName())) {
                hasAnimal = true;
                animalObject = anAnimal;
                System.out.println("aqui2");
                break;
            }
        }

        System.out.println("aqui3");

        if (!hasAnimal) {
            animalObject = new Animal(animal);
            animalList.add(animalObject);
        }

        Appointment appointment = new Appointment(this, animalObject, date);
        appointmentArrayList.add(appointment);
    }

    public void deleteAppointment(String date) {
        for (int i = 0; i < appointmentArrayList.size(); i++) {
            if (appointmentArrayList.get(i).getDate().equals(date)) {
                appointmentArrayList.remove(i);
                break;
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Appointment> getAppointmentArrayList() {
        return appointmentArrayList;
    }

    static void addClient(Client client){
        //TODO: implement
    }

}
