package JavaBasic;

public class resource implements AutoCloseable {
    public static void main(String[] args) {
        resource r = new resource();
        r.temp1();
    }

    @Override
    public void close() throws RuntimeException {
        System.out.println("close");
        throw new IllegalStateException(); // 에러 발생
    }

    public void hello() {
        System.out.println("hello");
        throw new IllegalStateException(); // 에러 발생
    }

    public void temp1() {
        resource re = null;
        try {
            re = new resource();
            re.hello();
        } finally {
            if (re != null) {
                re.close();
            }
        }
    }

    public void temp2() {
        try (resource re = new resource()) {
            re.hello();
        }
    }
}
