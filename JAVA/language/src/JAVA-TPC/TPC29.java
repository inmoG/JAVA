import kr.poly.A;

public class TPC29 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        // System.out.println(a.toString());
        // System.out.println(a); // object toString >> kr.poly.A@4517d9a3

        Object o = new A(); // Upcasting
        ((A) o).display();
        System.out.println(o.toString());

    }
}
