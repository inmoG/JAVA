import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    // Dog, Cat >> Animal
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();

        // Dog.java x , Dog.class O
        // Dog dd= new Dog();
        // dd.eat();

        // Animal << dog.class, cat.class
        // Dog dd = enw Dog();
        // dd.eat();

        Animal animal = new Dog();
        animal.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}
