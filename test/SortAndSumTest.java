packakge com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAndSumTest {
    SortAndSum obj;
    @Before
    public void setUp() throws Exception {
        obj = new SortAndSum();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void reverseStr() {
        assertEquals("554421",obj.reverseStr("124545"));
    }

    @Test
    public void calculateSum() {
        assertEquals(8,obj.CalculateSum("134545"));
    }

    @Test
    public void checkSum() {
        assertEquals("ad",obj.checkSum(65));
    }

    @Test
    public void checkItTest() {
        assertEquals(false,obj.checkIt("233"));
    }
}
