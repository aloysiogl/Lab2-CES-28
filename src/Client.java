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

    void newAppointment(String date, String animal) {
        boolean hasAnimal = false;
        Animal animalObject = null;

        for (Animal anAnimal : animalList) {
            if (animal.equals(anAnimal.getName())) {
                hasAnimal = true;
                animalObject = anAnimal;
                break;
            }
        }

        if (!hasAnimal) {
            animalObject = new Animal(animal);
            animalList.add(animalObject);
        }

        Appointment appointment = new Appointment(this, animalObject, date);
        appointmentArrayList.add(appointment);
    }

    void deleteAppointment(String date) {
        for (int i = 0; i < appointmentArrayList.size(); i++) {
            if (appointmentArrayList.get(i).getDate().equals(date)) {
                appointmentArrayList.remove(i);
                break;
            }
        }
    }

    Integer getId() {
        return id;
    }

    String getName() {
        return name;
    }

    ArrayList<Appointment> getAppointmentArrayList() {
        return appointmentArrayList;
    }

    static Client addClient(Client client) {
        for (Client aClient : clientArrayList) {
            if (aClient.getId().equals(client.getId())) {
                return aClient;
            }
        }
        clientArrayList.add(client);
        return client;
    }

}
