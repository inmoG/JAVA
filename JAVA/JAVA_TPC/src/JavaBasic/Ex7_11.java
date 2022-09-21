package JavaBasic;

public class Ex7_11 {
    public static void main(String[] args) {
        // Child3 c = new Child3();
        // c.method1();
        // c.method2();

        Child3 b = new Child3();
        b.method1();
        b.method2();
        MyInterface.staticMethod();

        MyInterface2 a = new Child3();
        // a.method1();
        MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    // public void method1() {
    // System.out.println("Method1() in Child3");
    // }
    public void method3() {
        System.out.println("Method3() in Child3");
    }
}

class Parent3 {
    // public void method2() {
    // System.out.println("method2() in Parent3");
    // }
    public void method4() {
        System.out.println("method4() in Parent3");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1 in My Interface");
    }

    default void method2() {
        System.out.println("method2 in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    // default void method1() {
    // System.out.println("method1 in MyInterface2");
    // }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}