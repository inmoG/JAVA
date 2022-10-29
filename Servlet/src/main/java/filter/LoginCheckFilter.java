package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginCheckFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(false);

        boolean login = false;
        if(session != null){
            if(session.getAttribute("MEMBER") != null){
                login = true;
            }
        }
        if(login){
            chain.doFilter(request, response);
        }else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/loginForm.jsp"); // 로그인하지 않은 상태라면 loginForm.jsp 이동
            dispatcher.forward(request, response);
        }
    }

    @Override
    public void destroy(){

    }
}
