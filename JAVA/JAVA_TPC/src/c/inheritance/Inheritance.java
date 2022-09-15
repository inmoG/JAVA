package c.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Animal dog = new Dog("진도", "개", 4, false);
        Dog dog = new Dog();
        System.out.println(dog);
        dog.eatFood();
        dog.sound();
        // dog.move();
        // dog.walk_dog();

        // Animal cat = new Cat("뭉뭉", "고양이", 4, false);
        // System.out.println(cat);
        // cat.eatFood();
        // cat.sound();

        // cat.night(); The method night() is undefined for the type Animal

        // Dog dog = new Dog("진도", "개", 4, false);
        // System.out.println(dog);
        // dog.sound();
        // dog.sleep();
        // dog.walk_dog();

        // Cat cat = new Cat("꿀밤이", "고양이", 4, false);
        // System.out.println(cat);
        // cat.sound();
        // cat.sleep();
        // cat.night();

        // Dog dog = new Dog();
        // System.out.println(dog.toString());
        // dog.sound();
        // dog.walk_dog();

        // Cat cat = new Cat();
        // System.out.println(cat);
        // cat.night();
        // cat.sound();
    }
}
