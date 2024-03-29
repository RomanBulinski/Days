import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void testRepresentation() {
        Representation rep = new Representation();
        assertEquals(17,rep.daysRepresented(new int[][] {{10,15},{25,35}}));
        assertEquals(24,rep.daysRepresented(new int[][] {{2,8},{220,229},{10,16}}));
    }
}
