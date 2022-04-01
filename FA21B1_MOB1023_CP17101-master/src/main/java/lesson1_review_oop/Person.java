package lesson1_review_oop;

public class Person {
    private String name;
    private int age;
    private String cccd;

    public Person() {
    }

    public Person(String name, int age, String cccd) {
        this.name = name;
        this.age = age;
        this.cccd = cccd;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getCccd() {
        return cccd;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getThongTin() {
        String thongTin = this.cccd + " - " + this.name + " - " + this.age;
        return thongTin;
    }
}
