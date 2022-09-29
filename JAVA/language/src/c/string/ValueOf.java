package c.string;

import c.model.MemberDTO;

public class ValueOf {
    public static void main(String[] args) {
        System.out.println("valueOf".toString());
        System.out.println(String.valueOf("valueOf"));
        System.out.println("----------------------------");
        MemberDTO dto = new MemberDTO();
        nameNullCheck(dto);
    }

    private static void nameNullCheck(MemberDTO dto) {
        String name = String.valueOf(dto.name);
        if (name == "null") {
            System.out.println("null");
        } else {
            System.out.println("안녕하세요 " + name + "입니다 :)");
        }
    }

}
