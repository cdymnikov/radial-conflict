package radial.conflict;

import java.io.IOException;
import javax.servlet.http.*;
import com.google.inject.*;

public class GetFrameServlet extends HttpServlet {

    private final IFrameFactory frameFactory;

    @Inject
    public GetFrameServlet(IFrameFactory frameFactory) {
        this.frameFactory = frameFactory;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        Frame frame = frameFactory.Create();

        resp.setContentType("text/plain");
		String template = "{ \"x\": %f, \"y\": %f }";
        resp.getWriter().println(String.format(template, frame.getX(), frame.getY()));
    }
}
