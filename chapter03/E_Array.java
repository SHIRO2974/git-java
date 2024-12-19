package chapter03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class E_Array {
    public static void main(String[] args) {

/*

*/
        ArrayList<Integer> List = new ArrayList<>(10);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                List.add(i);

            }
        }
        System.out.println(List);
        List.add(3, 50);
        System.out.println(List);
    }
}
