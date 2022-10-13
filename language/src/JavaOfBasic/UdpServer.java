package JavaOfBasic;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
    public void start() throws IOException {
        // 7777포트를 사용하는 소켓 생성
        DatagramSocket socket = new DatagramSocket(7777);
        DatagramPacket inPacket, outPacket;

        byte[] inMsg = new byte[10];
        byte[] outMsg;

        while (true) {
            inPacket = new DatagramPacket(inMsg, inMsg.length);
            socket.receive(inPacket); // 패킷을 통해 데이터 수신

            // 수신한 패킷으로부터 client IP주소와 Port 얻는다.
            InetAddress address = inPacket.getAddress();
            int port = inPacket.getPort();

            // 서버의 현재시간을 시분초 형태로 반환
            SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
            String time = sdf.format(new Date()); // time
            outMsg = time.getBytes(); // time을 byte배열로 변환

            // 패킷 생성해 client에게 전송한다.
            outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
            socket.send(outPacket);
        }
    }

    public static void main(String[] args) {
        try {
            new UdpServer().start();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
