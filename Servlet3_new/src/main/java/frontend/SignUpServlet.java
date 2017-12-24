package frontend;


import dbService.DBException;
import interfaces.Frontend;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet implements Frontend {


    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        try {
            DB_SERVICE_IMP.addUser(request.getParameter("login"), request.getParameter("password"));
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

}
