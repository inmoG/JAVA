package c.exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException mye) {
            // TODO: handle exception
            mye.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }

        } catch (MyException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
