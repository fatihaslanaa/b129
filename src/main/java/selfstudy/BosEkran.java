package selfstudy;

import java.util.Arrays;
import java.util.Scanner;

public class BosEkran {
    public static void main(String[] args) {

        //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        // konsola "Anagramdır" yazdırıniz. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        // Örneğin; "Mary" ve "army" ve "RAMY" "meat" ve "team"  Anagramlardır.

        Scanner input =new Scanner(System.in);
        System.out.println("Iki String giriniz :");

        String s1 = input.nextLine();

        String s2 = input.nextLine();

        String a1[] = s1.toLowerCase().split("");

        Arrays.sort(a1);// Ara  Ba

        String a2[]= s2.toLowerCase().split("");

        Arrays.sort(a2);

        if(s1.length() != s2.length()){
            System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram Degil");

        } else if (Arrays.equals(a1,a2)) {
            System.out.println("Anagramdir");


        }else {
            System.out.println("Anagram Degil");
        }


    }
}
