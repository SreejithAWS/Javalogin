// LoginServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Validate username and password (you can replace this with your own validation logic)
        if(username.equals("admin") && password.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp"); // Redirect to welcome page
        } else {
            response.sendRedirect("login.html"); // Redirect back to login page
        }
    }
}
