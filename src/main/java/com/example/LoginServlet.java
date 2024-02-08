import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Your authentication logic here
        if (isValidUser(username, password)) {
            response.sendRedirect("welcome.html");
        } else {
            response.sendRedirect("login.html");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Dummy implementation for demonstration
        return username.equals("admin") && password.equals("password");
    }
}