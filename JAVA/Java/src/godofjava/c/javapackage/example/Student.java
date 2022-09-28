package godOfJava;

public class Student {
    public String name;
    public String address;
    public String phone;
    public String email;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}
