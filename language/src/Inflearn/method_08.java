package Inflearn;

class reference {
    public int a;

    public reference(int a) {
        this.a = a;
    }
}

public class method_08 {
    public static void main(String[] args) {
        reference r = new reference(100);
        sum(r);
        System.out.println(r.a);
    }

    public static void sum(reference r) {
        r.a += 400;
        System.out.println(r.a);
    }
}
