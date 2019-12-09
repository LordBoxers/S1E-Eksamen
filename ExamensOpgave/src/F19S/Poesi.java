package F19S;

public class Poesi {
    //Forår 2019 Skriftlig 4 timer
    
    public static void main(String[] args) {
        String[] sa1 = {"Roser","Violer"};
        String[] sa2 = {"Røde","blå"};
        String udskriv = digt(sa1,sa2);
        System.out.println(udskriv);
    }
    
    public static String linje(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return "";
        }
        return s1+" er " + s2 + "\n";
    }
    
    public static String digt(String[] s1, String[] s2) {
        String sretur ="";
        
        if (s1.length != s2.length || s1.length == 0 || s2.length==0) {
            return "";
        }
        for (int i = 0; i<s1.length; i++) {
            sretur += linje(s1[i],s2[i]);
        }
        return sretur;
    }
}