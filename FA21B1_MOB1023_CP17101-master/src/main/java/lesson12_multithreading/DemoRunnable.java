package lesson12_multithreading;

public class DemoRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Xin chào CP17101");
    }

    public static void main(String[] args) {
        Runnable r1 = new DemoRunnable(), r2 = new DemoRunnable();

        Thread t1 = new Thread(r1), t2 = new Thread(r2);
        
        System.out.println("--------------------");
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.start();
        System.out.println("--------------------");
        
        System.out.println("--------------------");
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
        t2.start();
        System.out.println("--------------------");
    }
}
