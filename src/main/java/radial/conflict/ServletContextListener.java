package radial.conflict;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ServletContextListener extends GuiceServletContextListener {

    @Override protected Injector getInjector() {
        return Guice.createInjector(
                new FrameServletModule());
    }
}