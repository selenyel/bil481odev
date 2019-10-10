package ff;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void testFound() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));       assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
        ArrayList array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));       assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
        ArrayList<Integer> array = new ArrayList<>();       assertFalse(new App().search(array, 1));
    }

    public void testNull() {
        assertFalse(new App().search(null, 1));
    }

}
