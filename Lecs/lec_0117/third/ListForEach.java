package Lecs.lec_0117.third;

import java.util.ArrayList;

public class ListForEach {
    
   public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<Integer>();
       for (int i = 0; i < 10; i++) {
           System.out.println(i);
       }
   
       for (int j: numbers) {
           System.out.println(j);
       }
   }
}
