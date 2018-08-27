import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private Client client;

    @Before
    public void setUp() throws Exception {
        client = new Client("davi", 101);
    }

    @Test
    public void testConstructor() {
        assertEquals(client.getId(), (Integer) 101);
        assertEquals(client.getName(), "davi");
    }

    @Test
    public void testAppointmentList() {
        client.newAppointment("12/10/97", "charlie");
        client.newAppointment("20/10/97", "charlie");
        client.newAppointment("30/10/97", "rex");

        assertEquals(client.getAppointmentArrayList().get(0).getDate(), "12/10/97");
        assertEquals(client.getAppointmentArrayList().get(1).getDate(), "20/10/97");
        assertEquals(client.getAppointmentArrayList().get(2).getDate(), "30/10/97");
        assertEquals(client.getAppointmentArrayList().get(0).getAnimal().getName(), "charlie");
        assertEquals(client.getAppointmentArrayList().get(1).getAnimal().getName(), "charlie");
        assertEquals(client.getAppointmentArrayList().get(2).getAnimal().getName(), "rex");

        client.deleteAppointment("12/10/97");
        client.deleteAppointment("30/10/97");

        assertEquals(client.getAppointmentArrayList().get(0).getDate(), "20/10/97");
        assertEquals(client.getAppointmentArrayList().get(0).getAnimal().getName(), "charlie");
    }
}