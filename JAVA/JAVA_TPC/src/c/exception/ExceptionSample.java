package c.exception;

import inflearn.IntArray;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.checkVariable3();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
            System.out.println("this code should run!");
        } catch (Exception e) {
            System.err.println("Exception occured.");
        }
        System.out.println("This code must run.");
    }

    public void checkVariable() {
        int[] intArray = new int[5];
        try {
            // int a = 1;
            System.out.println(intArray[5]);
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println(a);
            System.out.println(intArray.length);
        }
        System.out.println("This code must run");
    }

    public void checkVariable2() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(IntArray.length);
        }
        System.out.println("This code must run");
    }

    public void checkVariable3() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.err.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run");
    }
}
