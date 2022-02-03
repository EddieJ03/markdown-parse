import static org.junit.Assert.*;
import org.junit.*;

public class BadTest {
    @Test
    public void failAdd() {
        assertEquals(1+1, 10);
    }
}
