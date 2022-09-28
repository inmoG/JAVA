package JavaBasic;

public class tryResource implements AutoCloseable {

    @Override
    public void close() throws RuntimeException {
        // TODO Auto-generated method stub
        System.out.println("close!");
        throw new IllegalStateException();
    }

    public void hello() {
        System.out.println("hello");
    }

}
