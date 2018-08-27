public class Appointment {
    private Client client;
    private Animal animal;
    private String date;
    private String symptoms;

    public Appointment(Client _client, Animal _animal, String _date, String _symptoms) {
        client = _client;
        animal = _animal;
        date = _date;
        symptoms = _symptoms;
    }

    Client getClient() { return client; }

    Animal getAnimal() {
        return animal;
    }

    String getDate() {
        return date;
    }

    String getSymptoms() { return symptoms; }

    void setSymptoms(String _symptoms) { this.symptoms = _symptoms; }
}
