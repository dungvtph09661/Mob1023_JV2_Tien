package lesson2_interface;

public abstract class Animal {
    private String ten;
    private String color;
    
    /*
     * Hàm mà ko có thực thi chi tiết
     * -> Hàm trừu tượng
     * -> phải khai báo hàm với abstract
     *
     * Class chứa 1 hàm trừu tượng
     * -> Class đó được coi là trừu tượng
     * -> Khai báo class là abstract
     */
    abstract public void tiengKeu();

    public Animal() {
    }

    public Animal(String ten, String color) {
        this.ten = ten;
        this.color = color;
    }

    public String getTen() {
        return ten;
    }

    public String getColor() {
        return color;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
