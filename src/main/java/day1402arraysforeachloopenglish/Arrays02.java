package day1402arraysforeachloopenglish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given print the date like "Month:09     Day:20      Year:2022"


        String date  = "09/20/2022";

        //Split method returns Array
        String dateArray[] = date.split("/");

        System.out.println(Arrays.toString(dateArray));

        System.out.println("Month:" + dateArray[0]);
        System.out.println("Day:" + dateArray[1]);
        System.out.println("Year:" + dateArray[2]);

        System.out.println("--------------");


        //Example 2
        String number = "1232/4539/99/000";

        String numberArray[]= number.split("/");

        System.out.println(Arrays.toString(numberArray));
        System.out.println("first:" + numberArray[0]);
        System.out.println("second:" + numberArray[1]);
        System.out.println("thirst:" + numberArray[2]);
        System.out.println("fourth:" + numberArray[3]);


        //Example 3: Get string from user and type code to find the number of words in the String.
        //          "I like to move it,move it "==> 7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence....");
        String str = input.nextLine();

        String arr[]=str.split(" ");

        System.out.println("The number of the word is " + arr.length);



        //Example 4: Count the number of words starts with "a" in the String


        int counter = 0;//This is called flag
        for(String w : arr){
            if(w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter+ "Word start with a");



        //Example 5 :
        String s = "I want a be  rich man because money is bringsaaaaaa welfare ";

        String words[] = s.split("");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);





















    }
}
