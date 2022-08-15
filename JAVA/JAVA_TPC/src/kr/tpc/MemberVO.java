package kr.tpc;

public class MemberVO {
    // public String name;
    // public int age;
    // public String tel;
    // public String addr;
    private String name;
    private int age;
    private String tel;
    private String addr;

    public MemberVO() {
        // default constructor
    }

    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

    // setter, getter method
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }

    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "MemberVO [addr=" + addr + ", age=" + age + ", name=" + name + ", tel=" + tel + "]";
    }

}
