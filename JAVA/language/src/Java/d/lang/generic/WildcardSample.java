package Java.d.lang.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<?> wildcard = new WildcardGeneric<String>();
        // WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardObjectMethod(wildcard);
    }

    public void wildcardStringMethod(WildcardGeneric<String> c) {
        String value = c.getWildcard();
        System.out.println(value);
    }

    public void wildcardObjectMethod(WildcardGeneric<?> c) {
        // 제네릭한 클래스의 타입이 다를 경우 <?>로 지정한다.
        Object value = c.getWildcard(); // 리턴 타입을 Object로 지정한다.
        if (value instanceof String) {
            System.out.println(value);
        } else {
            System.out.println(value);
        }
    }
}
