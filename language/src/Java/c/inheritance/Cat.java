package Java.c.inheritance;

public class Cat extends Animal {
    public boolean night = true;

    public Cat() {
        super("야옹이", "고양이", 4, false);
        System.out.println("고양이가 태어났습니다.");
    }

    public Cat(String name, String kind, int legCount, boolean hasWing) {
        // super();
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }

    public void sound() {
        System.out.println("야옹!!");
    }

    public void night() {
        System.out.println(night + "눈에서 빛이나온다!!");
    }

}
