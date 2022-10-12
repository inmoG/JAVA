package JavaBasic;

import java.util.ArrayList;

class Customer2 implements Runnable {
    private Table2 table;
    private String food;

    Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}

class Table2 {
    String[] dishNames = { "donut", "burger", "donut" };
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName(); // 현재 쓰레드
            System.out.println(name + " is waiting");

            try {
                wait(); // COOK 쓰레드를 기다리게 한다.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // 잠자고 있는 COOK 깨우기 위함
                        return; // 종료
                    }
                } // for문 끝

                try {
                    System.out.println(name + " is waiting..");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}

public class Ex13_15 {
    public static void main(String[] args) throws InterruptedException {
        Table2 table = new Table2(); // 쓰레드가 공유하는 객체

        new Thread(new Cook2(table), "COOK").start();
        new Thread(new Customer2(table, "donut"), "CUST1").start();
        new Thread(new Customer2(table, "burger"), "CUST2").start();
        Thread.sleep(2000);
        System.exit(0);
    }
}
