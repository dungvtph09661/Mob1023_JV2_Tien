package lesson11_io_character;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileIO {
    public static void main(String[] args) {
        String filename = "demo_file_character.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("--------------------");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            
            String txt = "Xin chào CP17101";
            writer.write(txt);
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            
            while (true) {
                int i = reader.read();
                if (i == -1) {
                    break;
                }
                
                char c = (char) i;
                System.out.print(c);
            }
            
            System.out.println("");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
