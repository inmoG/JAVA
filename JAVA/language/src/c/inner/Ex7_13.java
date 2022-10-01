package c.inner;

public class Ex7_13 {
    class InstanceInner {
        public int a = 10;
    }

    static class StaticInner {
        public int a = 10;
    }

    InstanceInner iv = new InstanceInner();
    StaticInner cv = new StaticInner();
    // StaticInner cv2 = new InstanceInner();
    // InstanceInner iv2 = new StaticInner();

    static void staticMethod() {
        // static멤버는 인스턴스 멤버에 직접 접근할 수 없다.
        // InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        System.out.println("static 내부 클래스 : " + obj2.a);

        // 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
        // 인스턴스 클래스를 스태틱멤버로 접근하려면 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        Ex7_13 outer = new Ex7_13();
        InstanceInner obj1 = outer.new InstanceInner();
        System.out.println("스태틱 메서드, 객체를 생성해 인스턴스 클래스를 접근했다." + obj1.a);
    }

    void instanceMethod() {
        // 인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        System.out.println("인스턴스 : " + obj1.a);
        System.out.println("스태틱 : " + obj2.a);
        // LocalInner lv = new LocalInner();
        // 메서드 내에 선언된 지역 내부 클래스는 외부에서 접근할 수 없다.
    }

    void myMethod() {
        class LocalInner {
            private int a = 10;
        }
        LocalInner lv = new LocalInner();
        System.out.println("지역 내부 클래스 " + lv.a);
    }
}
