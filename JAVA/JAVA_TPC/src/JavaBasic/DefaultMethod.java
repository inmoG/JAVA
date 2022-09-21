package JavaBasic;

interface MyInterface {
    default void Method() {
        System.out.println("Hello Java!!");
    }
}

class Myclass implements MyInterface {

}

public class DefaultMethod {
    public static void main(String[] args) {
        Myclass example = new Myclass();
        example.Method();
    }
}
