package Java.c.annotation;

import c.inheritance.Parent;

public class AnnotationOverride extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }

    @Deprecated
    public void noMoreUse() {

    }
}
