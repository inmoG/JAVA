package JavaOfBasic;

import java.net.URL;
import java.net.URLConnection;

public class Ex16_3 {
    public static void main(String[] args) {
        String address = "http://www.codechobo.com/sample/hello.html";

        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            System.out.println("conn.toString(): " + conn);
            System.out.println("getAllowUserInteraction(): " + conn.getAllowUserInteraction());
            System.out.println("getConnectTimeout(): " + conn.getConnectTimeout());
            // System.out.println("getContent(): " + conn.getContent());
            System.out.println("getContentEncoding(): " + conn.getContentEncoding());
            System.out.println("getContentLength()" + conn.getContentLength());
            System.out.println("getContentType(): " + conn.getContentType());
            System.out.println("getDate()" + conn.getDate());
            System.out.println("getDefaultAllowUserInteraction(): " + URLConnection.getDefaultAllowUserInteraction());
            System.out.println("getDefaultUseCaches(): " + conn.getDefaultUseCaches());
            System.out.println("getDoInput(): " + conn.getDoInput());
            System.out.println("getDoOutput(): " + conn.getDoOutput());
            System.out.println("getExpiration(): " + conn.getExpiration());
            System.out.println("getHeaderFields(): " + conn.getHeaderFields());
            System.out.println("getIfmodifiedSince()" + conn.getIfModifiedSince());
            System.out.println("getLastModified(): " + conn.getLastModified());
            System.out.println("getReadTimeOut(): " + conn.getConnectTimeout());
            System.out.println("getURL(): " + conn.getURL());
            System.out.println("getUseCaches(): " + conn.getUseCaches());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
