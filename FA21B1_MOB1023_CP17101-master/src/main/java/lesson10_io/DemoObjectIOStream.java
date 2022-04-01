package lesson10_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import luyen_tap_1.Nguoi;

public class DemoObjectIOStream {
    public static void main(String[] args) {
        String filename = "demo_data_io.txt";
        
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Ghi file thành công");
        System.out.println("--------------------");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Đọc file thành công");
    }
    
    public static void ghiFile(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Nguoi n = new Nguoi("Ng Van A", "HN", "HN", 1);
            oos.writeObject(n);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Nguoi n = (Nguoi) ois.readObject();
            System.out.println(n.getHoTen());
            System.out.println(n.getGioiTinh());
            System.out.println(n.getQueQuan());
            System.out.println(n.getDiaChi());

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
