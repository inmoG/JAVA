public class TPC34 {
    public static void main(String[] args) {
        String str1 = new String("APPLE");
        String str2 = new String("APPLE");

        if (str1 == str2) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        if (str1.equals(str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String str3 = "apple";
        String str4 = "apple";

        if (str3 == str4) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
