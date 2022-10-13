package JavaOfBasic;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UdpClient {
    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket); // datagramPacket 전송
        datagramSocket.receive(inPacket); // 수신

        System.out.println("current server time : " + new String(inPacket.getData()));
        datagramSocket.close();
    }

    public static void main(String[] args) {
        try {
            new UdpClient().start();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
