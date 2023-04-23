package day05typecastingstringmanipulation;

public class StringManupulations01 {

   //String bir Non-Primitive data type idir ve ayni zaman da bir class tir

    public static void main(String[] args) {

        String s = "Java is easy";

        // Example: "s" Stringindeki tum characterleri buyuk harfe cevir.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        // Example: "s" Stringindeki tum characterleri kucuk harfe cevir.

        String sLower = s.toLowerCase();
        System.out.println(sLower);// java is easy


        //Ex 3 :  // Example: "s" Stringindeki ilk  characterleri aliniz

         char firstChar=s.charAt(0);
        System.out.println(firstChar);//J

        //Ex 4 :  // Example: "s" Stringindeki ikinci ve sondan ikinci characterleri aliniz.

        char secondChar=s.charAt(1);

        char secondLastChar=s.charAt(10);

        System.out.println(secondChar);
        System.out.println(secondLastChar);


        //2.Yol:   Ayni satirda yazdirmak icin

        System.out.println(""+secondChar+secondLastChar );

        //Ex 5: "s" Stringindeki kullannilan  character sayisini bulunuz

        int sLength = s.length();//uzunlugundaki sayilarin sayisi
        System.out.println(sLength); //12


        //Ex 6: "s" Stringindeki ilk 4 characteri aliniz
        // substring(0, 4)==> "0" yani ilk index dahil , "4" yani ikinci index haric dir.
        String sub1 =s.substring(0, 4);
        System.out.println(sub1);//Java

        //Ex 7: "s" Stringindeki "is" kelimesini aliniz

        String sub2 =s.substring(5, 7);
        System.out.println(sub2);//is

      //Ex 8:

        String sub3=s.substring(8, 12);
        System.out.println(sub3);//easy

        //note:Bir characterden  yerden baslayip String in sonuna kadar almak isterseniz ikinci index i yazmayiniz
        //s.substring(8, 12 ); yerine s.substring(8); yaziniz
        String sub4=s.substring(8);
        System.out.println(sub4);


        //Ex9://Ex 5: "s" Stringindeki "money " kelimesi var olup olmadigini yaziniz

        boolean isExist=s.contains("money");
        System.out.println(isExist);//false
     /*
     bir methodu ogrenirken uc sey mutlaka ogren
     1- method ne is yapar?
     2-bu methodun farkli kullanimlari nasildir??
     3-bu method bize ne return eder ?
      */


        //Ex 10 : //Ex 5: "s" Stringin'in belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isStart= s.startsWith("");
        System.out.println(isStart);

        //Ex11: //Ex 5: "s" String'inin 6.character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isBegin=s.startsWith("i",5);//prefix >> baslangic demek
        System.out.println(isBegin);//ilk bes karakteri gorme i harfiyle baslayan true verdi.






    }
}
