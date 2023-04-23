package day02datatypesmethodcreation;

public class Variables01 {
     ///interwiew'da soruluyor nelerdir farklari >>>
    //primitive data types --> char - boolean - byte - short- int - long- float- double
    //float: Virgullu  (Ondalik Sayilar  Decimal numbers) Fiyatlandirmalar 12.99 az yer kaplar
    //Double: Virgullu sayilar(ondalik sayilar.dDecimal numbers (Hucre Agirligi: 0.00000000112) cok yer kaplar
    //Note: Primitive data type lerini java olusturmustur, biz olusturamayiz
    //Note: Primitive datatype larin isimlerinde sadece kucuk harf kullanilir buyuk harf kullanilmaz.
    //Note: Primitive data'lar data type lara gore memoryde farkli farkli yer kaplarlar
    //Note: Primitive data lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {


        //ornek1:
        //Note: Java Decimal numbers lari otomatik olarak "Double" kabul eder
        // Siz datatype ini float diye israr ederseniz hata verir;
        //float olmasinda israr edersen sonundsa F yazmalisin
        //Note: float memoryde 4 byte yer kaplar , double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89f;
        //System.out.println ekrana yzdirir ve pointer i bir sonraki satira koyar

        System.out.println(shirtPrice + shoesPrice);
        System.out.print(shoesPrice);
        System.out.println(); //System.out.println//kisa yolu ==>sout yaz Enter'a bas

        //ornek2 ; Hucre agirligi ve AMip'in agirligi icin iki tane variable olusturun ve agirliklarin farkini ekrana yazdirin

        double weightCell = 0.00000000000112;
        double weightAmip = 0.00000000000023;
        System.out.println(weightCell - weightAmip);//8.9E-13==>8.9 carpi 10 uzeri 13 E==>Exponent


    }




    }


