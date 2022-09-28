import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        // 직접 설계했을 경우
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // 상속 << Dog.class, Cat.class
        Animal ani = new Dog(); // upcasting(자동 형변환)
        // 상속 관계이므로 자동 형변환(object casting)이 된다
        ani.eat();

        ani = new Cat();
        // 상속 관계이므로 자동 형변환(object casting)이 된다
        ani.eat(); // 컴ㅍㅏ일시점 >> animal 실행시점 > Dog

        // ani.night();
        ((Cat) ani).night(); // downcasting(강제 형변환)
        // 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리

        Object o = new Dog();
        // o.eat
        ((Dog) o).eat(); // downcasting
    }
}
