package JavaBasic;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        // if (args.length != 1) {
        // System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
        // System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
        // System.exit(0);
        // }

        Stack st = new Stack<>();
        // String expression = args[0];
        String expression = "((2+3)))*1+3";
        System.out.println("expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다. 스택을 정상적으로 종료합니다. : " + st.isEmpty());
            } else {
                System.out.println("괄호가 일치하지 않습니다. 스택에 괄호가 남아있습니다. : " + st.peek());
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다, 스택이 비어있습니다. : " + st.isEmpty());
        }
    }
}
