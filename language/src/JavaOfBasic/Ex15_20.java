package JavaOfBasic;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex15_20 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
            UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // 객체 직렬화
            // 직렬화할 객체가 많을 때는 각 객체를 개별적으로 직렬화하는 것보다
            // ArrayList와 같은 컬렉션에 저장해서 직렬화 하는 것이 좋다 역직렬화할 때 ArrayList 하나만 역직렬화 하면 되기 때문이다.
            // out.writeObject(u1);
            // out.writeObject(u2);
            out.writeObject(list);

            System.out.println("직렬화가 끝났습니다.");
            out.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
