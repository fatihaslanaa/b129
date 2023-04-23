package day05typecastingstringmanipulation;

public class StringManupulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";


        //Ex1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnds=s.endsWith("money");
        System.out.println(isEnds);


        //Ex2: "s" String inin "money" kelimesini "dollar" kelimesine  replace yap ceviriniz

         String newS1=s.replace("money","dollar");
        System.out.println(newS1);

        //Ex 3: earn kelimesini win kelimesine ceviriniz

       String newS2 = s.replace("earn","win");
        System.out.println(newS2);

       //Ex:a change to *
        // note: replace () methodunda coklu character ile calisirsaniz mecbur cift tirnak kullanicaksiniz
        // tek karakter hem cift hem tek oluyor
        // Ama ya ikiside cift tirnak veya tek tirnak olmak olmalidir

        String news3=s.replace("a","*");
        System.out.println(news3);


        String news4=s.replace("n","XXX");
        System.out.println(news4);//LearXXX Java earXXX moXXXey



        //Ex6: "s"Stringindeki "e leri"butun harfleri siliniz


        String news5=s.replace("e","");// silmede mecburen cift tirnak kullanilmali
        System.out.println(news5);//Larn Java arn mony

       String t = "Ali 13 yasindadir!...";

        //Ex 7:"t" Stringindeki tum rakamlari * yapin
        //note "bir grup datayi" degistirmek icin mesela rakamlar harfler sesli harfle bir grup datadir
        //replace All kullanilir
        String t1 =t.replaceAll("[0-9]","*");//[] note:bir grup datayi ifade etmek icin"Regular Expression"(regex)
        System.out.println(t1);//Ali ** yasindadir!...


        /*

             Meshur Regex ' ler
             1) Tum rakamlari ==> [0-9]
             2) Tum kucuk harfler ==> [a-z]
             3) Tum buyuk harfler ==> [A-Z]
             4) Tum kucuk  harfler ve buyuk harfler ==> [a-zA-Z]
             5) Tum harfler ve rakamlar ==>[a-zA-Z0-9]
             6) Tum noktalama isaretleri ==>\\p{Punct}
             7) Tum sesli harfler ==> [aeiou]
             x, q, w harfleri ==> [xqw]
       ****  8) Kucuk harflerden farkli tum characterler ==> [^a-z]
             9) Tum harflerden farkli tum chracterler ==> [^a-zA-Z]
             10) Space disindaki tum karakterler chracterler ==> \\S









         */

        //Ex 8 : "t S"

        String t2 =t.replaceAll("[a-z-0-9]","[!]");
        System.out.println(t2);


      //Ex9:

        String t3=t.replaceAll("[aeiou]","[?");
        System.out.println(t3);//Al[? 13 y[?s[?nd[?d[?r!...

        //Ex 10:

        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ex11

        String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);//Ali++++yasindadir++++


        //Ex 12

       String t6= t.replaceAll("[^ ]","_");
        System.out.println(t6);//___ __ ______________


        //Ex 13: sesli harfler disindaki tum karakterleri & ceviriniz

        String  t7=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&






    }
}
