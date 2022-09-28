package JavaBasic;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의 에러!!");
            throw e; // 예외 발생
            // throw new Exception("고의 에러!!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그래이 정상 종료 되었음");
    }
}
