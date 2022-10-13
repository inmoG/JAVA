package Java.c.inheritance;

public class Animal {
    public String name;
    public String kind;
    public int legCount;
    public boolean hasWing;

    public Animal() {
        System.out.println("동물이 태어났습니다.");
    }

    public Animal(String name, String kind, int legCount, boolean hasWing) {
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.hasWing = hasWing;
        System.out.println(name + "동물이 태어났습니다.");
    }

    void move() {
        System.out.println("움직인다.");
    }

    public void eatFood() {
        System.out.println("냠냠 음식을 먹는다.");
    }

    public void sound() {
        System.out.println("소리를 낸다.");
    }

    public void sleep() {
        System.out.println("잔다...");
    }

    public void meet_human() {
        System.out.println(this.name + "난 사람이 좋아!!");
    }

    @Override
    public String toString() {
        return "Animal [hasWing=" + hasWing + ", kind=" + kind + ", legCount=" + legCount + ", name=" + name + "]";
    }

}
