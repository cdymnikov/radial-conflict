package radial.conflict;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class FrameServletModule extends ServletModule {
    @Override protected void configureServlets() {
        bind(GetFrameServlet.class).in(Singleton.class);
        serve("/frame").with(GetFrameServlet.class);
    }
}