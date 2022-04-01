package lesson6_collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> diemTP = new HashMap<String, Integer>();
        diemTP.put("lab_1", 9);
        diemTP.put("lab_2", 8);
        diemTP.put("lab_3", 10);
        System.out.println(diemTP);
        
        diemTP.put("lab_2", 3);
        System.out.println(diemTP);
    }
}
