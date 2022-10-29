package Java_TPC;


public class static_Example {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Static_field.pi;
        int result2 = Static_field.plus(10, 5);
        int result3 = Static_field.minus(10, 5);

        Static_field instance_var = new Static_field();
        int result4 = instance_var.minus(10, 1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
