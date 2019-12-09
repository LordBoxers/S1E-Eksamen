package examensopgave;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael
 */
public class ArraylistOpgave {
    public static void main(String[] args) {
        String s = "Jeg er en string";
        String s1 = "Jeg er også en String";
        ArrayList<String> aList = new ArrayList();
        aList.add(s1);
        AList(aList, s);
        PrintList(aList);
    }

    public static boolean AList(ArrayList<String> aList, String s) {
        for (int i=0; i>aList.size();i++) {
            if (s != aList.get(i)) {
                aList.add(s);
                Collections.sort(aList);
                return true;
            }
        }
        Collections.sort(aList);
        return false;
    }
    public static void PrintList(ArrayList<String> aList) {
        for (String s : aList) {
            System.out.println(s);
            }
        }
    }