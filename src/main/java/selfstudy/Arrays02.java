package selfstudy;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {


        //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        // konsola "Anagramdır" yazdırıniz. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        // Örneğin; "Mary" ve "army" ve "RAMY" "meat" ve "team"  Anagramlardır.
        Scanner scan = new Scanner(System.in);
        System.out.println("iki String giriniz :");

        String s1 = scan.nextLine();

        String s2 = scan.nextLine();

        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);// Ara ba

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);


        if (s1.length() != s2.length()) {
            System.out.println("Anagram Degil");

        } else if (s1.isEmpty() || s2.isEmpty()) { //  "||"  OR operator

            System.out.println("Anagram Degil"); //,araba anagram degil

        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Anagramdir");//araba abara esittir

        } else {

            System.out.println("Anagram Degil");
        }
    }
}





