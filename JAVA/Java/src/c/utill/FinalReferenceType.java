package c.utill;

import c.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto.hashCode());
        // dto = new MemberDTO();
        // System.out.println(dto.hashCode());
        dto.name = "inmo";
        System.out.println(dto);
        dto.name = "yeeun";
        System.out.println(dto);
    }
}
