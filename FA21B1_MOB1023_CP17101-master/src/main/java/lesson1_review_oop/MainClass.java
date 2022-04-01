package lesson1_review_oop;

public class MainClass {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("PH12345", 2000, "Nguyen Van A", 20, "0122123123");
        
        // Ép kiểu ngầm định
        Person p = new SinhVien("PH12345", 2000, "Nguyen Van A", 20, "0122123123");
        
        // Ép kiểu tường minh

        System.out.println(sv.getThongTin());
        System.out.println(sv.getThongTin("UDPM"));
    }
}
