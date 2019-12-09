package examensopgave;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class ArraylistOpgaveTest {
    
    public ArraylistOpgaveTest() {
    }

    /**
     * Test of main method, of class ArraylistOpgave.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ArraylistOpgave.main(args);
        fail("The test case is a prototype.");
    }

    /**
     * Test of AList method, of class ArraylistOpgave.
     */
    @Test
    public void testAList() {
        //act
        System.out.println("AList");
        ArrayList<String> aList = null;
        String s = "";
        //arrange
        boolean expResult = false;
        boolean result = ArraylistOpgave.AList(aList, s);
        //assert
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintList method, of class ArraylistOpgave.
     */
    @Test
    public void testPrintList() {
        System.out.println("PrintList");
        ArrayList<String> aList = null;
        ArraylistOpgave.PrintList(aList);
        fail("The test case is a prototype.");
    }
    
}
