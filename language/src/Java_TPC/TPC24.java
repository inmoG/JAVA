package Java_TPC;

public class TPC24 {
    public static void main(String[] args) {
        // Upcasting
        // Cat ani = new Cat();
        // Object ani = new Cat();
        Animal ani = new Cat();
        ani.eat(); // 컴파일시점 > animal.eat / 실행시점 > cat.eat
        // ani.night();
        // Cat c = (Cat)ani; // downcasting
        // c.night(0);
        ((Cat) ani).night();

        ani = new Dog();
        ani.eat();
        // 다형성
        // 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 객체지향 원리

        Object o = new Dog();
        // o.eat();
        ((Dog) o).eat();
    }
}
