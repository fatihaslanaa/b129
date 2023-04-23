package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
     //Kullanicidan bir diktorgenin en ve boyunu alan ve cevresini
        // hesaplayan kodu yaziniz
     //Diktortgenin Alani = en*boy
     //Diktortgenin cevresi  = 2*(en+boy)

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen diktortgenin  kisa kenari giriniz");
        int en=input.nextInt();


        System.out.println("Lutfen diktortgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println("Alan"+(en*boy));
        System.out.println("Cevre "+2*(en+boy));


        //10
        //Alan20
        //Cevre 24









    }
}
