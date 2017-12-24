package servlets;

import accounts.AccountService;
import accounts.UserProfile;
import dbService.DBException;
import dbService.DBService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {
    private final AccountService accountService;
    DBService dbService = new DBService();

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        /*String login = request.getParameter("login");
        String pass = request.getParameter("password");*/
        try {
            dbService.addUser(request.getParameter("login"), request.getParameter("password"));
        }catch (DBException e){
            e.printStackTrace();
        }
    }

}
