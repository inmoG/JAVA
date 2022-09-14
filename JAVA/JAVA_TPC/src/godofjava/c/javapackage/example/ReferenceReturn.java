package godOfJava;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
        System.out.println(reference.calculateAfterIntReturn());
        System.out.println(reference.ifConditionNoElseIntReturn());
    }

    public String stringReturn() {
        String returnString = "Return Value";
        return returnString;
    }

    public int[] intArrayReturn() {
        int returnArray[] = new int[10];
        return returnArray;
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int calculateAfterIntReturn() {
        int returnInt = 0;
        return returnInt;
        // returnInt++;
    }

    public int ifConditionNoElseIntReturn() {
        int returnInt = 0;
        if (returnInt == 0) {
            return ++returnInt;
        }
        return --returnInt;
    }

    public void wantToStopInTheMiddle(boolean flag) {
        if (flag) {
            return; // void 메소드에서 return; 사용하면 메소드 수행을 종료한다.
        }
    }
}
