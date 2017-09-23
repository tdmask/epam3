package task08;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StringOutput {
    public static void generate(HttpServletRequest request, HttpServletResponse response) {
        try {
            String numbers;
            response.setContentType("text/html; charset=utf-8");
            PrintWriter out = response.getWriter();
            out.print("<html><head>");
            out.print("<title>Sorting result</title>");
            out.print("</head><body>");
            numbers = request.getParameter("numbers");
            out.print("original input : " + numbers);
            StringSorter sorter = new StringSorter();
            out.print("<br>");
            out.print("result (sorted): " + sorter.sortNumbers(numbers));
            out.print("</body></html>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
