package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.DB;

public class AddUserServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        String imagePath = (String) request.getParameter("imagePath");
        String firstName = (String) request.getParameter("firstName");
        String lastName = (String) request.getParameter("lastName");
        String emailAddress = (String) request.getParameter("emailAddress");
        String expertise = (String) request.getParameter("expertise");
        String schedule = (String) request.getParameter("schedule");
        HttpSession session = request.getSession();
        
        // TODO: add code that gets the User object from the session and updates the database
        DB database = new DB();
        User user = new User(imagePath, firstName, lastName, expertise, emailAddress, schedule);
        database.addUser(user);
        String url = "/displayUsers";
        RequestDispatcher dispatcher =
              getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}