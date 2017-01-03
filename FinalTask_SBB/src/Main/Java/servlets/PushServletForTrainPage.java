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

        String stringNameTrain = null;

        try {
            stringNameTrain = req.getParameter("trainNumber");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (stringNameTrain == null || stringNameTrain.isEmpty()) {
            req.setAttribute("operationStatus", "The Object hasn't been added. " +
                    "Please, enter train number again.");
        } else {
            Integer trainNumber = Integer.parseInt(stringNameTrain);
            adminTrain.addTrain(trainNumber);
            req.setAttribute("operationStatus", "The Object has been successfully added.");

        }
        req.getRequestDispatcher("ResponsePage.jsp").forward(req, resp);
    }
}
