package day15arrays;

import java.util.Arrays;

public class CarpimSorusu {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        //sayilarin carpimi?
        System.out.println(Arrays.deepToString(numbers));//[[1, 2, 3], [4, 5, 6]]

        int[] num1 = numbers[0];
        int[] num2 = numbers[1];
        System.out.println(Arrays.toString(num1));//[1, 2, 3]
        System.out.println(Arrays.toString(num2));//[4, 5, 6]

        int sum1 = 1;
        for (int w : num1) {
            sum1 = w * sum1;

        }
        System.out.println(sum1);

        int sum2 = 1;
        for (int w : num2) {
            sum2 *= w;
        }
        System.out.println(sum2);
        System.out.println(sum2 * sum1);
    }
}
