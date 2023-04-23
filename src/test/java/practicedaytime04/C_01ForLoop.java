package practicedaytime04;

import java.util.Scanner;

public class C_01ForLoop {


    public static void main(String[] args) {

/*
KUllanicidan aldiginiz bir String degerde 'c' den onceki 'a'
 harfinin String deger icerisinde kac kez gectigini bulan  kodu yaziniz
 */




        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz");
        String str = input.nextLine().toLowerCase();

        int sayac=0;//bos konteyner olusturduk.

        for (int i = 0; i < str.length(); i++) {//i girilrn yazi degrinden kucuk asagi iner

            if(str.charAt(i)=='a'){

                sayac++;

            }else if (str.charAt(i)=='c'){
                break;

            }

        }
        System.out.println("c oncesi 'a' larin sayisi="+ sayac);






    }
}
