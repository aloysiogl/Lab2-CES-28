public class Appointment {
    private Client client;
    private Animal animal;
    private String date;
    private String symptoms;

    public Appointment(Client _client, Animal _animal, String _date, String _symptoms) {
        if (_symptoms == null || _symptoms.isEmpty())
            throw new java.lang.RuntimeException("No symptoms were informed");

        if (_date == null || _date.isEmpty())
            throw new java.lang.RuntimeException("No date was informed");
        boolean validDate = true;
        if (_date.length() != 8)
            validDate = false;
        if (_date.charAt(2) != '/' || _date.charAt(5) != '/')
            validDate = false;
        if (_date.charAt(0) < '0' || '9' < _date.charAt(0))
            validDate = false;
        if (_date.charAt(1) < '0' || '9' < _date.charAt(1))
            validDate = false;
        if (_date.charAt(3) < '0' || '9' < _date.charAt(3))
            validDate = false;
        if (_date.charAt(4) < '0' || '9' < _date.charAt(4))
            validDate = false;
        if (_date.charAt(6) < '0' || '9' < _date.charAt(6))
            validDate = false;
        if (_date.charAt(7) < '0' || '9' < _date.charAt(7))
            validDate = false;
        if (!validDate)
            throw new java.lang.RuntimeException("Invalid date format");

        client = _client;
        animal = _animal;
        date = _date;
        symptoms = _symptoms;
    }

    Client getClient() {
        return client;
    }

    Animal getAnimal() {
        return animal;
    }

    String getDate() {
        return date;
    }

    String getSymptoms() {
        return symptoms;
    }

    void setSymptoms(String _symptoms) {
        this.symptoms = _symptoms;
    }
}
