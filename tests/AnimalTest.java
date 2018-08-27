import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;

    @Before
    public void setUp() throws Exception {
        animal = new Animal("charlie");
    }

    @Test
    public void testConstructor() {
        assertEquals(animal.getName(), "charlie");
    }
}