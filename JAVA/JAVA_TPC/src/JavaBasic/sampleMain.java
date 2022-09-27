package JavaBasic;

public class sampleMain {
    public static void main(String[] args) {
        sampleMain test = new sampleMain();
        // test.tryResource();
        test.tryCatch();
    }

    public void tryCatch() {
        Sample sample = null;
        try {
            sample = new Sample();
            sample.exe();
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        } finally {
            sample.close();
        }
    }

    public void tryResource() {
        try (Sample sample = new Sample()) {
            sample.exe();
        }
    }
}
