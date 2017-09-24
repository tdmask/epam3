package task08.temp;

import task08.temp.StringOutput;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StringInput extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        performTask(request, response);
    }

    private void performTask(HttpServletRequest request, HttpServletResponse response) {
        StringOutput.generate(request, response);
    }
}
