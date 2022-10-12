package JavaBasic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class javaException {
    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        BufferedInputStream bis = null;
        try {
            is = new FileInputStream("file.txt");
            bis = new BufferedInputStream(is);
            int data = -1;
            while ((data = bis.read()) != -1) {
                System.out.println((char) data);
            }
        } finally {
            if (is != null)
                is.close();
            if (bis != null)
                bis.close();
        }
    }
}
