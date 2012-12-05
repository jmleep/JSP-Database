package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.DB;


public class DeleteUserServlet extends HttpServlet
{

    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        String emailAddress = request.getParameter("emailAddress");
        
        // TODO: add code that deletes the user that corresponds with the email address from the database
        DB database = new DB();
        database.deleteUser(emailAddress);
        String url = "/displayUsers";
        RequestDispatcher dispatcher =
              getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}