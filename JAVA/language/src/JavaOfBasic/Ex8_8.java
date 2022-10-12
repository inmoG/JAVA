package JavaBasic;

public class Ex8_8 {
    public static void main(String[] args) {
        // throw new RuntimeException(); // runtime 을 고의로 발생시킨다.
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            // 배열 에러
        } catch (NullPointerException e) {
            // 참조변수 에러
        }
    }
}
