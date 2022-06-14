package kr.poly;

import java.lang.*;

public class A extends Object {
    public A() {
        super();
    }

    public void display() {
        System.out.println("나는 A!!");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "재정의 메서드입니다.";
    }
}
