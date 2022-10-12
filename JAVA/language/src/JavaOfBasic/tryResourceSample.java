package JavaBasic;

public class tryResourceSample {
    public static void main(String[] args) {

        tryResourceSample sample = new tryResourceSample();
        sample.TryCatchResource();
    }

    public void TryCatchFinally() {
        tryResource sample1 = null;
        tryResource sample2 = null;

        try {
            sample1 = new tryResource();
            sample2 = new tryResource();
            sample1.hello();
            sample2.hello();
        } finally {
            if (sample1 != null) {
                sample1.close();
            }

            if (sample2 != null) {
                sample2.close();
            }
        }
    }

    public void TryCatchResource() {
        try (tryResource sample1 = new tryResource(); tryResource sample2 = new tryResource()) {
            sample1.hello();
            sample2.hello();
        }
    }
}
