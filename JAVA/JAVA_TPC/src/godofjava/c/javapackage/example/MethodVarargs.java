package godOfJava;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbers(1, 2, 3, 4, 5);
        MemberDTO dto = new MemberDTO("inmo", "01011111111", "inmo@naver.com");
        System.out.printf(dto.name, dto.phone, dto.email);
    }

    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }
}
