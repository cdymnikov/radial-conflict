package radial.conflict;

import java.io.IOException;
import javax.servlet.http.*;

public class EchoServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("{ \"name\": \"Radial Conflict\" }");
    }
}
