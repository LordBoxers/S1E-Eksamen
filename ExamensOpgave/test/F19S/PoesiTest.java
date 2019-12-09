package F19S;

import static F19S.Poesi.linje;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class PoesiTest {
    
    @Test
    public void linjeTest(){
        // 
        String s1 = "Roser";
        String s2 = "Røde";
        //
        String actual = linje(s1,s2);
        String expected = s1+" er " + s2 + "\n";
        //
        assertEquals(expected, actual);
    }
}
