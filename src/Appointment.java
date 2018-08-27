public class Appointment {
    private Client client;
    private Animal animal;
    private String date;

    public Appointment(Client _client, Animal _animal, String _date){
        client = _client;
        animal = _animal;
        date = _date;
    }

    public String getDate(){
        return date;
    }
}
