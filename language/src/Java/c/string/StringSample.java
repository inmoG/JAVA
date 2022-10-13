package Java.c.string;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();

        try (Scanner input = new Scanner(System.in)) {
            String encodingData = input.nextLine();
            // nextLine() 한줄 단위로 입력받아 개행문자 포함
            // next() 개행문자 무시, 계속 입력받음
            sample.convertUTF8(encodingData);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void convertUTF8(String data) throws UnsupportedEncodingException {
        String encodingKorean = data;
        byte[] array = encodingKorean.getBytes("UTF-8"); // encoding
        printByteArray(array); // encoding 내용 출력
        String decodingKorean = new String(array, "UTF-8"); // decoding
        int length = decodingKorean.getBytes().length; // 몇 Byte인지 계산
        System.out.println(decodingKorean + ": " + length + "Bytes");
    }

    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.print(data + "");
        }
        System.out.println();
    }
}
