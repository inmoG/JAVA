package Inflearn;

public class method_10 {
    public static void main(String[] args) {
        String[] re = caseReturn("korea", "USA");
        System.out.println(re[0] + " - " + re[1]);
    }

    public static String[] caseReturn(String kr, String usa) {
        kr = kr.toUpperCase();
        usa = usa.toLowerCase();
        String[] re = { kr, usa };

        return re;
    }
}
