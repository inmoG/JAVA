package inflearn;

public class IntArray {
    private int count;
    private int[] arr;

    public IntArray() {
        this(10);
    }

    public IntArray(int init) {// 배열 생성
        arr = new int[init];
    }

    public void add(int data) { // 배열 추가
        arr[count++] = data;
    }

    public int get(int index) { // 배열 가져오기
        return arr[index];
    }

    public int size() {
        return count;
    }

}
