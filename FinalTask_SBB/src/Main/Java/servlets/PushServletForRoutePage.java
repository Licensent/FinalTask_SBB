package servlets;

import service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DarthVader on 03.01.2017.
 */
@WebServlet("/pushRoute")
public class PushServletForRoutePage extends HttpServlet {

    AdminService adminRoute = new AdminService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String stringRouteAndTrainNumber = null;

        try {
            stringRouteAndTrainNumber = req.getParameter("routeNumber");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (stringRouteAndTrainNumber == null || stringRouteAndTrainNumber.isEmpty()) {
            req.setAttribute("operationStatus", "The Object hasn't been added. " +
                    "Please, enter route number again.");
        } else {
            Integer routeAndTrainNumber = Integer.parseInt(stringRouteAndTrainNumber);
            adminRoute.addRoute(routeAndTrainNumber);
            req.setAttribute("operationStatus", "The Object has been successfully added.");
        }
        req.getRequestDispatcher("ResponsePage.jsp").forward(req, resp);
    }
}
