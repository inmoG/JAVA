package c.inner;

class Ex7_12 {

    public class InstanceInner {
        // 인스턴스 내부 클래스
        int iv = 100;
        static int cv = 100; // 에러 static 변수 선언 불가
        final static int CONST = 100; // final static은 상수이므로 허용
    }

    static class StaticInner {
        // 스태틱 내부 클래스
        int iv = 200;
        static int cv = 200; // static 클래스만 static멤버를 정의가능
    }

    void myMethod() {
        class LocalInner {
            // 지역 내부 클래스
            int iv = 300;
            // static int cv = 300; // 에러 static 변수 선언 불가
            final static int CONST = 300; // final static은 상수이므로 허용
        }
        int i = LocalInner.CONST;
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        // System.out.println(LocalInner.CONST); 에러. 지역 내부 클래스는 내부 클래스를 생성한 메서드 내에서만 사용
        // 가능하다.
    }
}