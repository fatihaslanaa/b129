package day06StringManipulationsIfStatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        // Bir Stringin basinda ve sonunda space characteri varsa siliniz
        //   " Ali Can "     ==>            "Ali Can"

        // trim methodu kiriklari almak anlaminda kullanilir rutus azicik kesmek

        String s ="  Ali Can  ";
        s.trim();
        System.out.println(s);

      // ***  trim() method u bir string in bas ve sonundaki space characterini siler,aradaki space lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Ex 2 : asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz//
        //       String tv = "$456.99";   String laptop = "$875.99"; ==>

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2);//456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);//875.99

       Double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);/// virgullu sayi mutlaka double dir
        System.out.println(totalPrice);//1332.98

     //Ex 3 : verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz
        // "Ali Can" ==> AC   // Inishials diyorlar

        String name = "    Ali cAN    ";




        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//  A yi verdi ilk harf i

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); //C  //split parcalamak  demek


        System.out.println("" +first+second); //AC yi verir; yanyana yazilimini

       //Ex4 : Bir String in hic character icermedigini (Bos String)kontrol eden kodu yaz

        String str = "";

        //1.yol length () kullan

        boolean result1 = str.length()==0;//== mi demektir.
        System.out.println("String bos mu ? " +result1);

        //2.yol :

        boolean result2=str.isEmpty(); // ** Ilk tercih bu olmali ***
        System.out.println("String bos mu ?" + result2);


        //Ex 5 : Bir String in space haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String t = "       ";

        //1. yol
        boolean result3 = t.replace("","").length()==0;
        System.out.println("Sadece space mi var?"+ result3);


        //note isBlank() methodu sadeece space iceren Stringler icin True verir space disinda bir character icerirse false verir.
        // note isBlank() methodu bos Stringler icin de true verir
        //note  ==> space + hicbirsey icin de true verir


        //2. yol  en iyi yol    v
        boolean result4 =  t.isBlank();
        System.out.println("Sadece space mi var?"+ result4);

        //3.yol

        boolean result5 = t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?"+ result5);


        //Ex 6 : Bir Stringde a,e,i characterlerinin ilk gorunumlerinin index leri toplamini yazdiriniz

        // "Java is easy to learn" ==> 1+5+8 = 14


        String  r =  "Java is easy to learn";
       int idxA = r.indexOf('a');
        System.out.println(idxA);//1


        int idxI = r.indexOf('i');//5
        System.out.println(idxI);

       int idxE = r.indexOf('e');//8
        System.out.println(idxE);

        System.out.println("Indexler toplami:"+ (idxA+idxI+idxE));//14


        //Ex 7 : Bir String de Java kelimesinin ilk olarak  kacinci indexlerde kullanildigini gosteren kodu yaziniz

        // "Ah java vah Java sensiz olmuyor Java." ==> 3

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //note indexof("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin yani J ' nin indexini almis oluruz
        // indexof methodu olmayan chracterler icin kullanilirsa her zaman - 1 verir


        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);


        //Ex 8 : Bir stringde a,i,e "son" gorunumlerini

        String v = "Java is easy to learn";

       int idxOfA =  v.lastIndexOf('a');//18
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');//5
        System.out.println(idxOfI);


        int idxOfE=v.lastIndexOf('e');//17
        System.out.println(idxOfE);

        System.out.println(idxOfA+idxOfI+idxOfE);//40





        //Interview sorusu:
        //Ex 9 : Bir String deki tekrarsiz characterleri ekrana yazdiriniz
        //       abbcccdc  ==>  ad(tekrarsiz olanlardir)

        String y = "abb";

        char ch = y.charAt(0); //a

        if(y.indexOf(ch)==y.lastIndexOf(ch)){
            System.out.println(ch);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);

        }











        //Ex 12 : Sayi uc basamakli ise ekrana "Rakam"yazdirin

        int n = -123;

        n=Math.abs(n);//mutlak deger eksi olani pozitife cevirir 123 olarak cikar.

        if (n>99 && n<1000){
            System.out.println("WooooW");




        }

        // Note : Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir
        // Bazi kodlari bazi sartlara gore aktive etmk icin if statement kullanilir
        // Kodlari belli sartlara bagli olarak calistirmak icin kullanilir.
        // if you study hard , you will learn Java


        //Javadaki if cumlesi

        //Ex10  : sayi pozitif ise ekrana pozitif yazdir

        int num = 12;

        if(num>0){
            System.out.println("Pozitif");

        }

        //Ex 11 sayi -1 ile 10 arasinda ise ekrana rakam yazdirin
        int number = 3;

        if(number> -1 && number<10){
            System.out.println("Rakam");

        }











    }


}
