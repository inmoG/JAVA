import kr.tpc.*;

public class TPC31 {
    public static void main(String[] args) {
        Object[] o = new Object[2]; // 다형성 배열
        o[0] = new A();
        o[1] = new B();

        display(o);
    }

    private static void display(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            if (o[i] instanceof A) {
                ((A) o[i]).go();
            } else {
                ((B) o[i]).go();
            }
        }
    }

}
