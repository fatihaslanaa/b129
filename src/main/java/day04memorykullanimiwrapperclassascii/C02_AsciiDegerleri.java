package day04memorykullanimiwrapperclassascii;

public class C02_AsciiDegerleri {

    /*
 ASCII= Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
 Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi  char data
 turunde isleme alinirsa o char degerinin Ascii Table'daki karsiligini isleme alir.
 Harf ve sembollere deger atar.
 Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda
 hersey 1001001 den olusur. bu yapiya cevirebilmek icin Ascii Table olusturulmustur.
 Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.

*/

    public static void main(String[] args) {

        int deger = 20;
        char harf = 'a';

        //1.yol

        int sum = deger+harf;//20+97=117 a nin degeri=97
        System.out.println("bir tam sayi ile harfin toplami"+sum);

        //2.yol

        System.out.println("2.yol Toplam"+(deger+harf));


        char rakam1 ='1';
        System.out.println("rakam = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+(rakam1+rakam2+rakam3+rakam4));//202 ascii degerini verdi
        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+rakam1+rakam2+rakam3+rakam4);//1234  degerini verdi (yanyana yazdi parantez olmadigi icin )


       char kh='a';
       char bh='A';


        System.out.println("a'nin Ascii Degeri="+(kh+0));//97Ascii degeri
        System.out.println("A'nin Ascii Degeri="+(bh+0));//65Ascii degeri

        System.out.println("kh > bh "+(kh>bh));//islem sonucu true yada false doner



        // Herhangi bir karakterin ascii degerini hesaplattiralim

        char space = ' ';
        System.out.println(space+0);
        System.out.println("space in ascii degeri="+(space+0));// yazinin  yaninda deger cikarmak icin


        // char data type larinda Java karakteri int degerde atanabilir
        //cunku char data type inin bir resim degeri birde
        //Ascii den gelen int degeri vardir
        //Bu sekilde Ascii degerini bulabiliriz


        int hrf = 'm';

        //2.yol sonuna "+hrf yazarak yani bulunur

        System.out.println("int harfinin Ascii degeri="+hrf);



        byte b=125;

        float f= 2.45565f;

        long l= 44546575757575L;

        char ch = 'h';

        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(b<ch);//false







    }



}
