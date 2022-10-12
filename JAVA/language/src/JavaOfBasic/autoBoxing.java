package JavaBasic;

import Java.c.inheritance.MemberDTO;

public class autoBoxing {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO(10);
        int sum = 10 + dto.age;
        System.out.println(sum);
    }
}
