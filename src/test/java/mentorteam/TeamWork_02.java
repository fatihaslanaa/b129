package mentorteam;

import java.util.Arrays;
import java.util.Scanner;

public class TeamWork_02 {
    public static void main(String[] args) {
        // Example 2: Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        // konsola "Anagramdır" yazdırıniz. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        // Örneğin; "Mary" ve "army" ve "RAMY" "meat" ve "team"  Anagramlardır.

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki String giriniz :");

        String s1 = scan.nextLine().trim();
        String s2 = scan.nextLine().trim();

        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);


        if (s1.length() != s2.length()) {
            System.out.println("Anagram degil");

        } else if (s1.isEmpty() || s2.isEmpty()) {

            System.out.println("Anagram degil");


        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Angramdir");


        } else {

            System.out.println("Anagram degildir");
        }


    }
}
