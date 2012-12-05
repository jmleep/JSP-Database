package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.DB;
import java.util.ArrayList;


public class adminLogin extends HttpServlet
{

    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException
    {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String url = "/displayUsers";
        HttpSession session = request.getSession();
        
        // TODO: add code that gets the User object from the session and updates the database
        if(userName.equals("master") && password.equals("password"))
        {
            DB database = new DB();
            ArrayList<User> user = database.listUsers();
            url = "/usersAdmin.jsp";
            session.setAttribute("userList", user);
        }
        else{}
            
        RequestDispatcher dispatcher =
              getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}