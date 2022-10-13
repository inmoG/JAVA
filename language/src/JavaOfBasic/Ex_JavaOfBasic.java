package JavaOfBasic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex_JavaOfBasic {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex15_18 DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();
            // ���ϸ�
            System.out.println(fileName);
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();
            Path path = Paths.get(fileName);
            try {
                List<String> allLines = Files.readAllLines(path);
                String nthLine = allLines.get(1);
                System.out.println(nthLine);
            } catch (IOException e) {
                // TODO: handle exception
            }
        }
    }
}
