package servlets;

import service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by DarthVader on 02.01.2017.
 */
@WebServlet("/pushTrain")
public class PushServletForTrainPage extends HttpServlet {
    private AdminService adminTrain = new AdminService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String stringTrainNumber = null;
        String stringTrainPlaces = null;

        try {
            stringTrainNumber = req.getParameter("trainNumber");
            stringTrainPlaces = req.getParameter("trainPlaces");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (stringTrainNumber == null || stringTrainNumber.isEmpty()
                || stringTrainPlaces == null || stringTrainPlaces.isEmpty()) {
            req.setAttribute("operationStatus", "The Object hasn't been added. " +
                    "Please, enter train number again.");
        } else {
            Integer trainNumber = Integer.parseInt(stringTrainNumber);
            Integer trainPlaces = Integer.parseInt(stringTrainPlaces);

            adminTrain.addTrain(trainNumber, trainPlaces);
            req.setAttribute("operationStatus", "The Object has been successfully added.");

        }
        req.getRequestDispatcher("ResponsePage.jsp").forward(req, resp);
    }
}
