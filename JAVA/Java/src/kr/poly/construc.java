package kr.poly;

public class construc {
    private String name;
    private int age;

    public construc(String name) {
        this.name = name;
    }

    public construc(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void mehtod() {
        System.out.println("매개 변수");
    }

}
