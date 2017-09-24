package task08;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletSorter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numbers;
        numbers = request.getParameter("numbers");
        StringSorter sorter = new StringSorter();
        request.setAttribute("input", numbers);
        request.setAttribute("result", sorter.sortNumbers(numbers));
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
}
