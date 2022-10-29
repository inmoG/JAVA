package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NullHandler implements CommandHandler {

    // process 추상 메서드 구현
    @Override
    public String process(HttpServletRequest req, HttpServletResponse res) throws Exception{
        res.sendError(HttpServletResponse.SC_NOT_FOUND);
        return null;
    }

}