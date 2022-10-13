public class method_15 {
    public static void main(String[] args) {
        Person a = new Person(20, "홍길동");
        Person b = new Person(30, "이순신");
        Person c = new Person(40, "을지문덕");
    }
}

class Person {
    public int age;
    public String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("나이 : " + age + "이름 : " + name);
    }
}