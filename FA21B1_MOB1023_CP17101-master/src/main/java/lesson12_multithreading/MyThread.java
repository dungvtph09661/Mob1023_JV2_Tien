package lesson12_multithreading;

public class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }
    
    public void run() {
        System.out.println(this.message);
    }
}
