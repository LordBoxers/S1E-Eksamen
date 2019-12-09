package F19S;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebh
 */
public class HjælpeklasseTest {
    
    @Test
    public void hjælpeklasseTest() {
    //Arrange
    int forventetLængde = 9;
    int reelLængde;
    String tal = "12342";
    //Act
    reelLængde = Hjælpeklasse.tilføjNuller(tal, 9).length();
    //Assert
    assertEquals(forventetLængde, reelLængde);
    }
       @Test
    public void hjælpeklasseNegativTest() {
    //Arrange
    int forventetLængde = 7;
    int reelLængde;
    String tal = "1234212";
    //Act
    reelLængde = Hjælpeklasse.tilføjNuller(tal, -10).length();
    //Assert
    assertEquals(forventetLængde, reelLængde);
    }

}
