package kr.poly;

public class Dog extends Animal {
    // 이름 나이 종 : 상태정보

    public Dog() {
        super(); // new Animal();
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("개처럼 먹다");
    }

}
