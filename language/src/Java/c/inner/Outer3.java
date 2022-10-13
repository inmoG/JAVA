package Java.c.inner;

public class Outer3 {
    int value = 10; // Outer3.this.value

    class Inner {
        int value = 20; // this.value

        void Method1() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("Outer3.this.value : " + Outer3.this.value);
        }
    }
}
