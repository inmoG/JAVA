package Java.c.exception;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        // // sample.MultiCatch();
        // sample.MultiCatchThreeWithNull();
        sample.MultiNoCatch();
    }

    public void MultiCatch() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
    }

    public void MultiCatchThreeWithNull() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

    public void MultiNoCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
    }
}
