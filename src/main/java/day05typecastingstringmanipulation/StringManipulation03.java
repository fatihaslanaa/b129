package day05typecastingstringmanipulation;

import java.util.Scanner;

public class StringManipulation03 {


    public static void main(String[] args) {

        /*

        Example 1 : Asagidaki kurallara gore kullanicinin girdigi pasword u kontrol ediniz

        i) En az 8 chracter olsun
        ii) Space characteri passworde olmasin
        iii) en az bir tane  buyuk harf olsun
        iv) En az bir tane kucuk harf olsun
        v) En az bir tane sembol olsun
        vi) En az bir tane rakam olsun




     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen paswordunuzu giriniz...");
        String pwd = input.nextLine();

        //i) en az 8 chracter
        boolean first=pwd.length()>7;
        System.out.println(first);

        //Space characteri passworde olmasin
        boolean second=!pwd.contains(" ");
        System.out.println(second);

        // iii) en az bir tane  buyuk harf olsun
        //note: buyuk harf olmayanlari sil ,
        //   Kalan character sayisina bak
        // character sayisi sifit ise buyuk harf yok demektir
        //sifirdan buyuk ise buyuk harf var demektir


       boolean third= pwd.replaceAll("[^A-Z]","").length()>0;//methodlari yanyana kullanmaya method chain denir


        System.out.println(third);


        //En az bir tane kucuk harf olsun


        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);


        //v) En az bir tane sembol olsun(harf ve rakam harici hersey )olsun


       boolean fifth= pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(fifth); //soru isareti "?" old icin bir charachter 1>0 true***


        //vi) En az bir tane rakam olsun

        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("password gecerlimi ?"+(first&&second&&third&&fourth&&fifth&&sixth));//password gecerlimi ?true



    }
}
