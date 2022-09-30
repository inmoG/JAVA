package c.inner;

public class ReferenceAtNested {
    static class StaticNested(){
        private int StaticNestedInt = 99;
    }

    class Inner{
        private int innerValue=100;
    }

    public void setValue(int value) {
        StaticNested nested = new StaticNested();
        nested.StaticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
