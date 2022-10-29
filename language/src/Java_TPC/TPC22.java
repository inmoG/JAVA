package Java_TPC;

public class TPC22 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        display(d);
        display(c);
    }

    // upcasting
    private static void display(Animal r) { // 다형성 인수
        r.eat();
        if (r instanceof Cat) {
            ((Cat) r).night(); // downcasting
        }

    }
}
