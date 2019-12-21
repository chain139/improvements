import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @Author Twist
 * @Date Created in 20:37 2019/12/15
 * @Description
 */
public class PrimitiveServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("PrimitiveServlet init!");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = servletResponse.getWriter();
        out.println("Hello. This is Twist.");
        out.print(new Date());
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("PrimitiveServlet destroy!");
    }
}
