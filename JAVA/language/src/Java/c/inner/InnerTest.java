package Java.c.inner;

class AAA {
    // AAA는 BBB의 외부 클래스
    int i = 100;
    BBB b = new BBB();

    class BBB { // BBB는 AAA 내부 클래스
        void method() {
            // AAA a = new AAA();
            // System.out.println(a.i);
            System.out.println(i); // 객체 생성없이 외부 클래스(AAA)의 멤버 접근가능
        }
    }
}

// class CCC {
// BBB b = new BBB();
// 캡슐화로 인해 외부에서 접근 불가
// }

public class InnerTest {
    public static void main(String[] args) {
        // AAA.BBB b = new BBB();
        // b.method(); 캡슐화로 인해 외부에서 접근 불가
    }
}
