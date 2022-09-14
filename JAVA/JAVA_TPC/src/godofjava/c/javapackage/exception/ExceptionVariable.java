package c.exception;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
    }

    public void checkVariable() {
        // int intArray[] = new int[5];
        int intArray[] = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]); // 예외 발생
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
}
