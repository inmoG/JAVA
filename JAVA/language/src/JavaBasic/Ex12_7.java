package JavaBasic;

class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() {
        System.out.println("Hello");
    }
}

@FunctionalInterface // 함수형 인터페이스는 추상메서드 1개만 가능하다.
interface Testable {
    void test(); // 추상 메서드
    // void check(); // 추상 메서드
}

public class Ex12_7 {
    @SuppressWarnings("deprecation")
    // deprecation 경고 억제
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // @Deprecated 메서드 사용

    }
}