package day14arraysenglish;

import java.util.Arrays;

public class ArraysEnglish01 {
    public static void main(String[] args) {
        // How to create an Arrray
        String names []= new String[5];

        //How to print an Array
        System.out.println(Arrays.toString(names));

        //How to put elements into anArray
        names[1]= "Tommy";
        names[3]= "Marry";
        names[0]= "Jimmy";
        names[2]= "Susan";
        names[4]= "Silvester";
        System.out.println(Arrays.toString(names));

        //How to print a specific element is an Array
        System.out.println(names[3]);

        //Example 1 : Create an integer array and print the sum of the first and the last elements on the console
         int ages[]= new int[7];
        System.out.println(Arrays.toString(ages));
        ages[0]= 20;
        ages[1]= 23;
        ages[2]= 25;
        ages[3]= 14;
        ages[4]= 17;
        ages[5]= 20;
        ages[6]= 10;
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[1]+ages[ages.length-1 ]);

        //example2 : Create a double array and find the sum of all elements in the array

        double prices[]=new double[4];

        prices[0]=1.2;
        prices[1]=3.2;
        prices[2]=2.4;
        prices[3]=5.61;
        System.out.println(Arrays.toString(prices));

        //1. way
        double sum = 0;

        for (int i = 0; i <prices.length ; i++) {


            sum = sum + prices[i];
        }
        System.out.println(sum);

        //2. way
double summy = 0;
for (double w : prices ){

    summy=summy+w;

      }
        System.out.println(summy);














    }

}
