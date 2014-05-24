package radial.conflict;

import java.io.IOException;
import javax.servlet.http.*;

public class GetFrameServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
		
		long seconds = System.currentTimeMillis() / 1000;
		double radians = seconds / 30.0;
		double radius = 100;
		double x = radius * Math.sin(radians);
		double y = radius * Math.cos(radians);
		
		String template = "{ \"x\": %f, \"y\": %f }";
        resp.getWriter().println(String.format(template, x, y));
    }
}
