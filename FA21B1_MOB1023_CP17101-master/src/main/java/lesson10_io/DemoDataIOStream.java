package lesson10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataIOStream {
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
            DataOutputStream dataOS = new DataOutputStream(fos);
            
            double giaTien = 10.05;
            char c = 'B';
            
            dataOS.writeDouble(giaTien);
            dataOS.writeChar(c);
            
            dataOS.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dataIS = new DataInputStream(fis);
            
            double d = dataIS.readDouble();
            char c = dataIS.readChar();
            
            System.out.println(d);
            System.out.println(c);
            
            dataIS.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
