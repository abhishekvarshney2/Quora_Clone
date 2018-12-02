package newpackage;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class LogoutServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            request.getRequestDispatcher("Account.jsp").include(request, response);  
              
            HttpSession session=request.getSession(false);  
            session.invalidate();  
              
            out.print("You are successfully logged out!");  
              response.sendRedirect("Signout1.html");
            out.close();  
    }  
}  