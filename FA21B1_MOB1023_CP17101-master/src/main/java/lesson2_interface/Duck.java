package lesson2_interface;

public class Duck
extends Animal implements Runable, Swimable {
    @Override
    public void run() {
    }

    @Override
    public void swim() {
    }
    
    public void tiengKeu() {
        System.out.println("...");
    }
}
