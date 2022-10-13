package Inflearn;

public class method_04 {
    public static void main(String[] args) {
        String result = stringReturn("korea");
        System.out.println(result);
    }

    public static String stringReturn(String input) {
        String result = input.toUpperCase();
        return result;
    }
}
