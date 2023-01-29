import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void setUp() {
        busStop = new BusStop("Airport");
        person = new Person();
        busStop.add(person);
        busStop.add(person);
    }

    @Test
    public void canAddToQueue() {
        assertEquals(2, busStop.queueSize());
    }

    @Test
    public void canRemoveFromQueue() {
        busStop.removePassengerFromQueue();
        assertEquals(1, busStop.queueSize());
    }
}