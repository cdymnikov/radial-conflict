package radial.conflict;

import com.google.inject.ImplementedBy;

@ImplementedBy(FrameFactory.class)
public interface IFrameFactory {
    Frame Create();
}
