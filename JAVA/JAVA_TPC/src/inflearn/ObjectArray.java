package inflearn;

public class ObjectArray {
    private int count;
    private Object[] arr;

    public ObjectArray() {
        this(10);
    }

    public ObjectArray(int init) {// 배열 생성
        arr = new Object[init];
    }

    public void add(Object data) { // 배열 추가
        arr[count++] = data;
    }

    public Object get(int index) { // 배열 가져오기
        return arr[index];
    }

    public int size() {
        return count;
    }
}
