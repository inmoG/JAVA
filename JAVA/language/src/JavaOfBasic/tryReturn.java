package JavaBasic;

public class tryReturn {
    public static void main(String[] args) {
        System.out.println("catch return : " + getCatchReturn());
        System.out.println("---------------------");
        System.out.println("try return :" + getTryReturn());
        System.out.println("---------------------");
        getVoidCatchReturn();
    }

    /*
     * try 또는 catch 구문에서 return이 발생하면 finally구문이 실행될까?
     * 1. void method : catch구문에 return이 있다면? >> return 상관없이 finally 실행
     * 2. string method : catch 구문에 return이 있다면? >> return 상관없이 finally 실행
     * 3. string method : try 구문에 return이 있다면? >> return 상관없이 finally 실행
     * 
     * 
     */
    static void getVoidCatchReturn() {
        int[] array = null;
        try {
            array = new int[3];
            System.out.println("try");
            System.out.println(array[3]); // 예외 발생
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("catch");
            return;
        } finally {
            System.out.println("finally");
        }
    }

    static String getTryReturn() {
        String str = "do";
        int[] array = null;
        try {
            array = new int[3];
            str = "Try";
            System.out.println(str);
            return str;
        } catch (Exception e) {
            // TODO: handle exception
            str = "Catch";
            System.out.println(e.getMessage() + str);
        } finally {
            str = "finally";
            System.out.println(str);
        }
        return str;
    }

    static String getCatchReturn() {
        String str = "do";
        int[] array = null;
        try {
            array = new int[3];
            str = "Try";
            System.out.println(str);
            System.out.println(array[3]); // 예외 발생
            // return str;
        } catch (Exception e) {
            // TODO: handle exception
            str = "Catch";
            System.out.println(e.getMessage() + str);
            return str;
        } finally {
            str = "finally";
            System.out.println(str);
        }
        return str; // 왜 finally가 아니라 catch가 출력돼..?
    }
}