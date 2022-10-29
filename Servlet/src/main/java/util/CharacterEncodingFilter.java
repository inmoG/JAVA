package util;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    private String encoding;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding(encoding);
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       encoding = filterConfig.getInitParameter("encoding");
       if(encoding == null){
           encoding = "UTF-8";
       }
    }

    @Override
    public void destroy() {
    }
}
