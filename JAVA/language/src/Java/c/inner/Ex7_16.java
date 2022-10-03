package Java.c.inner;

public class Ex7_16 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.Method1();
    }
}
