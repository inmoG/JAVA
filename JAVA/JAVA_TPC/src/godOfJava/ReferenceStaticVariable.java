package godOfJava;

public class ReferenceStaticVariable {
    // String name;
    static String name;

    public ReferenceStaticVariable() {

    }

    public ReferenceStaticVariable(String name) {
        // this.name = name;
        // ReferenceStaticVariable.name = name;
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("inmo");
        // static메소드는 클래스 변수만 사용할 수 있지만 인스턴스 메소드는 클래스 변수와 인스턴스 변수 모두 사용 가능하다.
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("yeeun");
        System.out.println(reference1.name);
    }
}
