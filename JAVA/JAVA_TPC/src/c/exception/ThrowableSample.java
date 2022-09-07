package c.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.Throwable();
    }

    public void Throwable() {
        int intArray[] = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]); // 예외 발생
        } catch (Throwable t) {
            // System.out.println(t.getMessage()); Cannot load from int array
            // because"intArray" is null

            // System.out.println(t.toString()); java.lang.NullPointerException: Cannot load
            // from int array because "intArray" is null

            // t.printStackTrace(); java.lang.NullPointerException: Cannot load from int
            // array because "intArray" is null
            // at c.exception.ThrowableSample.Throwable(ThrowableSample.java:13)
            // at c.exception.ThrowableSample.main(ThrowableSample.java:6)
        }
    }
}
