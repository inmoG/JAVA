package Inflearn;
import Inflearn.oop.*;

class Parent {
    int gender;
    int power;

    Parent() {
        this.gender = 1;
        this.power = 100;
    }

    void walk() {
        System.out.println("걸어가고 있어요~");
    }

}

class Child extends Parent {
    String name;
    int age;

    Child() {
    }

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @override
    void walk() {
        System.out.println("2배로 걸어가고 있어요~");
    }

    void printPerson() {
        System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender + " 파워 " + power);
    }
}

class inheritance_child extends inheritance {
    public void method2() {
        super.method();
    }
}

public class method_16 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        // p1.printPerson();
        p1.walk();
        Child c1 = new Child("슈퍼맨", 20);
        c1.printPerson();
    }
}
