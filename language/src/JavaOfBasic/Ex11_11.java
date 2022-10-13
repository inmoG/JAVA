package JavaBasic;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        // set, HashSet 모두 중복 x 순서 x
        // Set set = new HashSet();
        // set.add("abc");
        // set.add("abc");
        // set.add(new Person("inmo", 26));
        // set.add(new Person("inmo", 26));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person p = (Person) obj; // Object는 name과 age를 가지고 있지 않으므로 형변환 해야한다.
        return name.equals(p.name) && age == p.age;
    }
    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // result = prime * result + age;
    // return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Person other = (Person) obj;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // if (age != other.age)
    // return false;
    // return true;
    // }

}
