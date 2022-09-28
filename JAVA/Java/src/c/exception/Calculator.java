package c.exception;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.printDivide(4, 2);
            calc.printDivide(1, 0);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public void printDivide(double d1, double d2) throws Exception {
        double result = 0.0;
        try {
            if (d2 == 0) {
                throw new Exception("Second value can`t be Zero");
            }
            result = d1 / d2;
        } catch (Exception e) {
            // TODO: handle exception
            // e.printStackTrace();
        } finally {
            System.out.println(result);
        }

    }
}
