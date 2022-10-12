package Java.e.network;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        // sample.checkBuffer();
        sample.checkBufferStatus();
    }

    public void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int loop = 0; loop < 100; loop++) {
                buffer.put(loop);
            }

            System.out.println("Buffer capacity = " + buffer.capacity()); // 1024
            System.out.println("Buffer limit = " + buffer.limit()); // 1024
            System.out.println("Buffer position = " + buffer.position()); // 100
            buffer.flip();
            System.out.println("Buffer flipped!");
            System.out.println("Buffer limit = " + buffer.limit()); // 100
            System.out.println("Buffer position = " + buffer.position()); // 0
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void printBufferStatus(String job, IntBuffer buffer) {
        System.out.println("Buffer " + job + "!!");
        System.out.format("Buffer position=%d remaining=%d limit=%d\n", buffer.position(), buffer.remaining(),
                buffer.limit());
    }

    public void checkBufferStatus() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get(); // 1바이트씩 데이터 읽어오기
            printBufferStatus("get", buffer); // 1 1023 1024
            buffer.mark(); // 위치 표시하기 1
            printBufferStatus("mark", buffer); // 1 1023 1024
            buffer.get(); // 데이터 읽어오기 2
            printBufferStatus("get", buffer); // 2 1022 1024
            buffer.reset(); // 표시한 위치로 이동하기 1
            printBufferStatus("reset", buffer); // 1 1023 1024
            buffer.rewind();
            printBufferStatus("rewind", buffer); // 0 1024 1024
            buffer.clear(); // 데이터 지우기
            printBufferStatus("clear", buffer); // 0 1024 1024
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
