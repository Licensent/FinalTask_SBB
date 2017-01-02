package servlets;

import service.AdminServiceForStation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DarthVader on 02.01.2017.
 */
@WebServlet("/pushStation")
public class PushServletForStationPage extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        AdminServiceForStation adminService = new AdminServiceForStation();
        String stationName = null;

        try {
            stationName = req.getParameter("stationName");
            adminService.addStation(stationName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (stationName.equals(null)){
            req.setAttribute("operationStatus", "The Object hasn't been added. " +
                    "Please, enter station name again.");
        }else {
            req.setAttribute("operationStatus", "The Object has been successfully added.");

        }
        req.getRequestDispatcher("ResponsePage.jsp").forward(req, resp);


    }

}
