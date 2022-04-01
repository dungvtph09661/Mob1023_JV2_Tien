package lesson2_interface;

public class Fish
extends Animal implements Swimable {
    public void swim() {
        System.out.println("Swimming ...");
    }
    
    public void tiengKeu() {
        System.out.println("...");
    }
}
