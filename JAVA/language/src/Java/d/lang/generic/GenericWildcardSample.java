package Java.d.lang.generic;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod();
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "Data");
    }

    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c, T addValue) {

    }

    public <S, T extends Car> void multiGenericMethod(WildcardGeneric<T> c, T addValue, S another) {

    }
}
