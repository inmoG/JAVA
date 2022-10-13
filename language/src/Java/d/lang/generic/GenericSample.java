package Java.d.lang.generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkGenericDTO();
    }

    public void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());
        String temp1 = dto1.getObjct();

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());
        StringBuffer temp2 = dto2.getObjct();

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());
        StringBuilder temp3 = dto3.getObjct();

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);

    }
}
