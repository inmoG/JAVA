package JavaBasic;

import java.util.HashMap;

public class Ex12_2_1 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        // HashMap<String, Student> map = new HashMap<String, Student>(); JDK 1.7부터 생성자에
        // 타입지정 생략가능
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));

        // public V get(Object key) : V Type is Student3
        Student s = map.get("자바왕");
        // Student s = (Student)map.get("자바왕"); >> 지네렉스를 안썼을 때는 반환을 오브젝트 타입으로 해서 꼭 형변환이
        // 필요했다.
        System.out.println(map.get("자바왕").name);
    }
}

class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
