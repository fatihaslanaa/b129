package day1402arraysforeachloopenglish;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exist in an Array or not

        String str[] = {"Ali","Tom","Carl","Angie"};

        //1.Way

        String name = "Carl";
        int counter = 0 ;

        for(String w : str){
            if(w.equals(name)){
                counter++;

            }
        }
        if(counter>0){
            System.out.println(name + " exist in the array");

        }else{
            System.out.println(name + "does not exist in the array");
        }



        //2.Way : We will use binarySearch()method
        //   i) If the element exist binarySearch()method returns the index of the element


        Arrays.sort(str);
       int idx = Arrays.binarySearch(str,"Carl");
        System.out.println(idx);



        int idxMiami = Arrays.binarySearch(str,"Miami");
        System.out.println(idxMiami);






    }
}
