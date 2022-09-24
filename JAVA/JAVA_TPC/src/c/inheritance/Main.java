import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Person> people = new HashSet<>();
        Person p1 = new Person("inmo");
        Person p2 = new Person("inmo");
        people.add(p1);
        people.add(p2);

        System.out.println(p1.equals(p2)); // true
        System.out.println(people.size()); // 1
        System.out.println(p1.hashCode()); // 3237286
        System.out.println(p2.hashCode()); // 3237286

    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}