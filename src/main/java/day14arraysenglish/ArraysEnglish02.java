package day14arraysenglish;

import java.util.Arrays;

public class ArraysEnglish02 {
    public static void main(String[] args) {


        //Example1: Create a String Array and print the elements in alphabetical order on the console in different Lines

        String cities[] = new String[5];

        cities[0] = "Tokyo";
        cities[1] = "Sydney";
        cities[2] = "London";
        cities[3] = "New York";
        cities[4] = "Basel";

        //How to put element in alphabetical order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        //How to put element in alphabetical order

        for (String w : cities) {


            System.out.println(w);

        }

        //To get the number  of characters from a String use "Length()"
        //   To get the number of elements from an Array use "Length"

        //Example 2 : Create a String Array and print the elements whoose length  is less than 5

        String names[] = {"Ali", "Alex", "Thomas", "Mark", "Helly"};
        System.out.println(Arrays.toString(names));


        for (String w : names) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }
        System.out.println("============");

        //Example 3: Create a String Array and print the elements before "Tom"

        String students[] = {"Ali", "Alex", "Thomas", "Mark", "Helly"};


        for (String w : students) {

            if (w.equals("Tom")) {
                break;
            }
            System.out.println(w);

        }

        System.out.println("========");

        //Example 4: Create a String Array and print the elements before "Tom" and "Tom"
        for (String w : students) {

            System.out.println(w);


            if (w.equals("Tom")) {
                break;
            }


        }

        System.out.println("========");

        //Example 5: Create a String Array and print the elements diferent from "Tom"

        String employees[] = {"Ali", "Thomas", "Jackson","Tom","Martin"};

        for(String w : employees){

            if(w.equals("Tom")){
                continue;
            }
            System.out.println(w);
        }
    }
}















