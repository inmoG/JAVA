package c.inheritance;

public class ChildArg extends ParentAge {
    public ChildArg() {
        // super();
        super("ChildArg"); // 부모 클래스에 매개변수가 있는 생성자만 있으므로 super()를 이용해 부모 생성자 호출해야 한다.
        // super(null);
        System.out.println("Child Constructor");
    }
}
