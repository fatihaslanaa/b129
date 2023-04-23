package practicedaytime04;
import java.util.Scanner;
public class C_02ForLoop {
    public static void main(String[] args) {
      /*
        Kullanicidan String bir ifade aliniz.
        Harflerini alt alta gelecek sekilde
        " " bosluk veya 'a ' harfi geldiginde
         yazdirmayan diger karakterleri yazdiran kodu yaziniz
       */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");
        String str = input.nextLine();//gazi cantep
   for (int i = 0;      i <str.length();            i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == ' '){
                continue;//devam eetirir harfleri yazdirir
            }//if
            System.out.println(str.charAt(i));
        }//for loop
    }//main
}


