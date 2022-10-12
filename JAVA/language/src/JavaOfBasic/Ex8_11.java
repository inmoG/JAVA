package JavaBasic;

public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            // TODO: handle exception
            System.out.println("에러 메시지 :" + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 다시 설치하세요.");
        } catch (MemoryException e) {
            System.out.println("에러 메시지 :" + e.getMessage());
            e.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) // 설치 공간이 부족하면
        {
            throw new SpaceException("설치 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static void copyFiles() {
        System.out.println("copy..");
    }

    static void deleteTempFiles() {
        System.out.println("delete..");
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return false;
    }

}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
