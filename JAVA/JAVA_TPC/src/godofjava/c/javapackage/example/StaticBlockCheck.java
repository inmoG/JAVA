package godOfJava;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        // check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("-------------------");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data=" + StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("--------------");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data=" + StaticBlock.getData());
        /*
         * 어떠한 객체를 사용해서든지 클래스 변수 값을 변경하면 모든 객체는 변경된 클래스 변수 값을 바라보게 된다.
         * 이는 모든 객체가 하나의 값을 바라보기 때문이다.
         * 즉 각각의 객체가 고유한 값을 가질 수 없다.
         * 그러므로 모든 객체가 바라봐야 하는 변수일 경우에만 클래스 변수를 사용하는 것이 좋다.
         */
    }
}
