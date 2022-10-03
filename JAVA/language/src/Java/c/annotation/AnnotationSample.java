package Java.c.annotation;

public class AnnotationSample {
    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        AnnotationOverride child = new AnnotationOverride();
        child.noMoreUse();
    }
}
