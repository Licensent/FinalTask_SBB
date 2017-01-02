package servlets;

import service.AdminServiceForTrain;

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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        AdminServiceForTrain adminTrain = new AdminServiceForTrain();
        String stringNameTrain = req.getParameter("trainNumber");
        Integer trainNumber = Integer.parseInt(stringNameTrain);
        adminTrain.addTrain(trainNumber);

        if (trainNumber.equals(null)){
            req.setAttribute("operationStatus", "The Object hasn't been added. " +
                    "Please, enter station name again.");
        }else {
            req.setAttribute("operationStatus", "The Object has been successfully added.");

        }


        req.getRequestDispatcher("ResponsePage.jsp").forward(req, resp);



    }
}
