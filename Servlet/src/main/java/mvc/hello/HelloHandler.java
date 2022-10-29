package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class HelloHandler implements CommandHandler {

   // process 추상 메서드 구현

    @Override
    public String process(HttpServletRequest req, HttpServletResponse res) {
        req.setAttribute("hello", "Hello, MVC!!"); // request 속성에 저장
        return "/jsp/hello.jsp";
    }
}