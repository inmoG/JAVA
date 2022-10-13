package Java.e.network;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    public void basicWriteAndRead() {
        String fileName = "/mnt/f/Github/Back-end/JAVA/language/src/java/e/network/nio.txt";
        try {
            writeFile(fileName, "My first NIO sample.");
            readFile(fileName);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel(); // getChannel 메서드를 호출해 파일을 쓰기위한 FileChannel
                                                                           // 객체 생성
        byte[] byteData = data.getBytes(); // 데이터를 바이트 배열로 변환
        System.out.println(byteData);
        ByteBuffer buffer = ByteBuffer.wrap(byteData); // ByteBuffer에 static으로 선언된 wrap()메소드 호출하면 ByteBuffer 객체 생성 이
                                                       // 메소드의 매개변수는 저장할 Byte 배열을 넘겨준다.
        channel.write(buffer); // FileChannel 클래스에 선언된 write 메소드에 buffer 객체를 넘겨주면 파일에 데이터를 쓰게된다.
        channel.close();
    }

    public void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel(); // fileInputStream 클래스에 선언된 getChannel 메소드 사용해
                                                                          // 파일을 읽기위한 객체 생성
        ByteBuffer buffer = ByteBuffer.allocate(1024); // allocate메소드를 사용해 buffer 객체 생성 >> allocate 매개변수는 데이터가 기본적으로
                                                       // 저장되는 크기이다.
        channel.read(buffer); // read 메소드에 buffer객체를 넘겨줌으로써 데이터를 버퍼에 담으라고 알려준다 즉, channel에서 데이터를 가져와 buffer에
                              // 담는 의미.
        buffer.flip(); // buffer 에 담겨있는 데이터의 가장 앞으로 이동한다.
        while (buffer.hasRemaining()) { // 데이터가 남아있는지 확인
            System.out.print((char) buffer.get()); // 데이터가 있다면 한 바이트씩 데이터를 읽는다.
        }
        channel.close();
    }
}
