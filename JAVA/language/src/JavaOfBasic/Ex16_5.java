package JavaOfBasic;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Ex16_5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://github.com/castello/javajungsuk_basic/blob/master/javajungsuk_basic_%EC%9A%94%EC%95%BD%EC%A7%91.pdf";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("javajungsuk_basic_%EC%9A%94%EC%95%BD%EC%A7%91.pdf");

            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
