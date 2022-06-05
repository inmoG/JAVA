import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // 생활코딩 OOP 정리
        System.out.println(Math.PI);
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello Java");

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello Java2");
        f1.write("!!!");
        f1.close();
        f2.close();
    }
}
