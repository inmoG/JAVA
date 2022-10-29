package Java_TPC;

public class TPC25 {
    public static void main(String[] args) {
        // eat() -- override >> eat()
        // Animal a = Animal;
        // a.eat();
        // upcasting (부모의 역할로 사용 > 명령을 내리는 역할로 사용한다.)
        Animal ani = new Dog(); // eat{?} >> eat{개}
        ani.eat();
        ani.move();
        ani = new Cat(); // eat{?} >> eat{고양이}
        ani.eat();
        ani.move();
        ((Cat) ani).night(); // downcasting
    }
}
