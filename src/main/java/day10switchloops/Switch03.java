package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*
            Ask user to enter country name among  "America, England , Germany, Turkey,India ,Peru,Spain , Bulgary , Albania
            France" Type code to print abbrevation of the countries. "US,UK,DE,TR,IN,PE,ES,BG,AL,FR"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adi giriniz...");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()) {

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "spain":
                System.out.println("SP");
                break;
            case "peru":
                System.out.println("PE");
                break;

            default:
                System.out.println("Bu Ulke Gecersiz");


        }


    }
}
