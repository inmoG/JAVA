package c.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        boolean result = sample.nullCheck(null);
        System.out.println(result);
    
    }

    public boolean nullCheck(String text) {
        if (text == null)
            return true; // null
        else {
            int textLength = text.length();
            System.out.println(textLength);

            return false;
        }
    }

}
