package c.inner;

class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 1. 외부 클래스의 "private 멤버도" 접근 가능하다.
        int iiv2 = outerCv; // 외부 클래스의 static멤버도 접근 가능하다.
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
        // int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        // 지역 내부 클래스
        int lv = 0; // final 생략되어 있음 사실은 상수이다.
        final int LV = 0;
        // lv = 3; 변수화 시키면 안됨
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 2. 외부 클래스의 지역변수는 "final이 붙은 상수만" 접근 가능하다. 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도 지역 클래스의
            // 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있어서다.
            int liv3 = lv; // final이 생략된 상수기 때문에 접근 가능하다.
            int liv4 = LV;

            void Method() {
                System.out.println(lv); // 만약에 lv가 상수가 아니라 변수라면 에러가 발생한다. 지역 클래스 메소드는 수행되는데 외부의 myMethod가 종료되었다면 지역변수는
                                        // 소멸되어 참조할 수 없기 때문이다.
            }
        }
    }
}
