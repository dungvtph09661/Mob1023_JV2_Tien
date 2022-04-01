package lesson6_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        mySet.add(6);
        mySet.add(8);
        mySet.add(9);
        
        System.out.println("Giá trị gốc của myList & mySet: ");
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println("------------------------------------");
        
//        System.out.println(myList.indexOf(2));
//        System.out.println(myList.lastIndexOf(2));
        
//        myList.addAll(mySet); /* ~ myList += mySet */
//        mySet.addAll(myList);   /* ~ mySet += myList */

//        myList.retainAll(mySet);
//        mySet.retainAll(myList);
//
        Collections.shuffle(myList);
        System.out.println(myList);
        System.out.println("------------------------");
        
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = Integer.parseInt(o1.toString());
                int i2 = Integer.parseInt(o2.toString());
                
                if (i1 < i2) {
                    return -1;
                } else if (i1 > i2) {
                    return 1;
                }

                return 0;
            }
        };

        Collections.sort(myList, c);
        System.out.println(myList);
        
        Collections.reverse(myList);
        System.out.println(myList);
    }
}
