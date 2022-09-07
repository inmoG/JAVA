package c.exception;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwException(13);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void throwException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);

        // try {
        // if (number > 12) {
        // throw new Exception("Number is over than 12");
        // }
        // System.out.println("Number is" + number);
        // } catch (Exception e) {
        // e.printStackTrace();
        // // TODO: handle exception
        // }
    }
}
