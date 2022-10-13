package JavaBasic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // 개행문자 상관없이 입력받고 앞뒤 공백 제거

                if ("".equals(input)) {
                    continue; // 입력값이 없으면(true) 다시 입력받기 위해 while문으로 올라간다.
                }

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); // 대소문자 상관없이 q 입력받으면 프로그램 종료
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    // 그동안 입력받은 명령어 저장
                    save(input);

                    // final int SIZE = q.size();
                    // for (int i = 0; i < SIZE; i++) {
                    // System.out.println((i + 1) + "." + q.peek());
                    // }

                    // LinkedList 내용 출력
                    LinkedList list = (LinkedList) q;

                    final int SIZE = list.size();
                    for (int i = 0; i < SIZE; i++) {
                        System.out.println((i + 1) + "." + list.get(i)); // 각 index 내용 출력
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("입력 오류입니다.");
            }
        }
    }

    public static void save(String input) {
        // queue에 저장한다.
        if (!"".equals(input)) {
            // false이지만 ! 만나 true
            q.offer(input);
        }

        // queue 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if (q.size() > MAX_SIZE) { // size()는 Collection인터페이스에 정의
            q.remove();
        }
    }
}
