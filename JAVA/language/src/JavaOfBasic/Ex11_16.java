package JavaBasic;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("myId", "1234");
        map.put("myId", "aaaa");
        map.put("asdf", "aaaa");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요 : ");
            System.out.println("id : ");
            String id = s.nextLine().trim(); // " aaaa " 앞뒤 공백을 trim으로 제거

            System.out.println("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                // false >> ! true
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요 ! ");
                continue;
            }

            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요 !");
            } else {
                System.out.println("ID와 PW가 일치합니다.");
                break;
            }
        }
    }
}
