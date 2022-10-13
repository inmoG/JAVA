package Java.d.lang;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systemPropertiesCheck();
    }

    public void systemPropertiesCheck() {
        System.out.println("Java version : " + System.getProperty("java.version"));
        System.out.println("Java Home" + System.getenv("Java home"));
    }
}
