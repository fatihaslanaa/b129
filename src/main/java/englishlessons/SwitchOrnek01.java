package englishlessons;

import java.util.Scanner;

public class SwitchOrnek01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number...");
        double firstNum = input.nextDouble();

        System.out.println("Enter the second number...");
        double secondNum = input.nextDouble();

        System.out.println("Enter the operating among +, -, *,/");
        char operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNum + secondNum);
            case '-':
                System.out.println(firstNum - secondNum);
            case '*':
                System.out.println(firstNum * secondNum);
            case '/':
                System.out.println(firstNum / secondNum);
            default:
                System.out.println("That operation was not supported by this calculator");

        }


    }
}


