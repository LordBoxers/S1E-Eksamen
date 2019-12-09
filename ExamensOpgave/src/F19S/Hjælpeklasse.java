package F19S;

/* 2.Tilføj nuller
Skriv en klasse der hedder Hjælpeklassesom skal indeholde forskellige hjælpemetoder.
I denne klasse skal være en metode som hedder tilføjNullersom tager to parametre: en String af tal (fx ”84”) og en integer der siger hvor lang den String der skal returneres skal være.
Metoden skal tilføje nuller så den Stringder returneres har en længde svarende til integer-argumentet.
For eksempel skal tilføjNuller(”243”, 7)returnere  ”2430000”.
Hvis den streng der gives med som parameter allerede er lige så lang eller længere end det givne int parameter, returneres den oprindelige streng uændret.
 */
// @author sebh
public class Hjælpeklasse {

    public static void main(String[] args) {
        String ny = tilføjNuller("123124", -10);
        System.out.println(ny);
    }

    public static String tilføjNuller(String tal, int længde) {
        String newString = tal;
        int nullerTilføjes = længde - tal.length();
        for (int i = 0; i < nullerTilføjes; i++) {
            newString += "0";
        }

        return newString;
    }
}