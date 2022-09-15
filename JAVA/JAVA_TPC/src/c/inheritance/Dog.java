package c.inheritance;

public class Dog extends Animal {

    public Dog() {
        super("멍멍이", "개", 4, false);

        System.out.println("강아지가 태어났습니다.");
    }

    public Dog(String name, String kind, int legCount, boolean hasWing) {
        // super();
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }

    public void sound() {
        System.out.println("멍멍!");
    }

    public void walk_dog() {
        System.out.println("산책하다.");
    }

}
