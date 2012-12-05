package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.DB;

public class UpdateUserServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        String selected = request.getParameter("selected");
        String update = request.getParameter("update");
        String emailAddress = request.getParameter("emailAddress");
        HttpSession session = request.getSession();
        
        // TODO: add code that gets the User object from the session and updates the database
        DB database = new DB();
        if(selected.equals("imagePath"))
            database.updateImage(update, emailAddress);
        else if(selected.equals("firstName"))
            database.updateFirstName(update, emailAddress);
        else if(selected.equals("lastName"))
            database.updateLastName(update, emailAddress);
        else if(selected.equals("emailAddress"))
            database.updateEmail(update, emailAddress);
        else if(selected.equals("expertise"))
            database.updateExpertise(update, emailAddress);
        else if (selected.equals("schedule"))
            database.updateSchedule(update, emailAddress);
        else {}
        
        String url = "/displayUsers";
        RequestDispatcher dispatcher =
              getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}