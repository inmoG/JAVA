package godofjava.c.javapackage.sub;

public class SubStatic {
    public final static String CLASS_NAME = "SubStatic";

    public static void subStaticMethod() {
        System.out.println("subStaticMethod() is called.");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.subClassMethod(); // 같은 패키지 내에 있는 클래스는 import 하지 않는다.
    }
}
