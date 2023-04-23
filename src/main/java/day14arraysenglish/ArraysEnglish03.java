package day14arraysenglish;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEnglish03 {
    public static void main(String[] args) {

        //Example 1 : Create an Array together with the user
        // (Create an Array together with the user)

        //1. Step : Create an Array
        //2. Step : Insert the elementswith the user

        Scanner input = new Scanner(System.in);

        //1.Step : Create an Array
        System.out.println("Enter the number of the students you want to enter");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println(Arrays.toString(names));

        //2.Step : Insert the elements into the Array

        for (int i = 0; i < numOfStd; i++) {
            System.out.println("enter the " + (i + 1) + " student name");
            String stdname = input.next();
            if (!stdname.equalsIgnoreCase("q")) {
                names[i] = stdname;


            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(names));

    }
}
