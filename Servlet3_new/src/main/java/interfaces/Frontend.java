package interfaces;

import dbService.DBServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Frontend {
    DBServiceImp DB_SERVICE_IMP = new DBServiceImp();

    void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
