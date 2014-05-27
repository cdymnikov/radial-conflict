package radial.conflict;

public class FrameFactory implements IFrameFactory {
    @Override
    public Frame Create() {
        long seconds = System.currentTimeMillis() / 1000;
        double radians = seconds / 30.0;
        double x = 50 * Math.sin(radians);
        double y = 100 * Math.cos(radians);

        return new Frame(x, y);
    }
}
