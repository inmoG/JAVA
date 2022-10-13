class Person {
    protected String name;
    protected int age;
    protected int height;
    protected int weight;
    protected int number;
    protected String attack;
    protected double power;

    public void move() {
        System.out.println("이동 중..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", number="
                + number + ", attack=" + attack + ", power=" + power + "]";
    }
}

class villain extends Person {
    @override
    public void move() {
        System.out.println(name + "이동 중..");
    }

}

public class method_17 {
    public static void main(String[] args) {
        villain v = new villain();
        v.setName("좀비");
        v.setAge(20);
        v.setHeight(180);
        v.setWeight(80);
        v.setNumber(15001231);
        v.setAttack("창");
        v.setPower(99.5);
        System.out.println(v);
        v.move();
    }

}