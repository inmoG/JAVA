package JavaBasic;

public class Sample implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        // TODO Auto-generated method stub
        System.out.println("close..");
        throw new IllegalStateException();
    }

    public void exe() {
        System.out.println("실행 중..");
    }
}
