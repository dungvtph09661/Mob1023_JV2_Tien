package lesson12_multithreading;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Đây là thread 1"),
            t2 = new MyThread("Đây là thread 2");
        
        t1.start();
        t2.start();
    }
}
