package lesson2_interface;

public class Cat
extends Animal implements Runable {
    // Class Cat thực thi interface Runable
    
    /*
     * Khi Class Cat thực thi interface Runable,
     * class Cat sẽ phải triển khai toàn bộ các hàm
     * đã khai báo trong interface Runable
     */
    @Override
    public void run() {
        System.out.println("Running ...");
    }
    
    public void tiengKeu() {
        System.out.println("Meow");
    }
}
