import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppointmentTest {
    private Appointment appointment;

    @Before
    public void setUp() throws Exception {
        appointment = new Appointment(new Client("davi", 101), new Animal("charlie"), "12/10/97",
                "symptoms");
    }

    @Test
    public void testConstructor() {
        assertEquals(appointment.getClient().getName(), "davi");
        assertEquals(appointment.getClient().getId(), (Integer) 101);
        assertEquals(appointment.getAnimal().getName(), "charlie");
        assertEquals(appointment.getDate(), "12/10/97");
        assertEquals(appointment.getSymptoms(), "symptoms");
    }

    @Test
    public void testSymptomsString() {
        appointment.setSymptoms("newsymptoms");
        assertEquals(appointment.getSymptoms(), "newsymptoms");
    }
}