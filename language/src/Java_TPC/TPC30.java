package Java_TPC;

import Java.kr.tpc.A;
import Java.kr.tpc.B;

public class TPC30 {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object o) // 다형성 인수
    {
        if (o instanceof A) {
            ((A) o).go(); // dwonCastinge
        } else {
            ((B) o).go();
        }
    }
}
