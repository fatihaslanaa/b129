package practice01.datatypescannerdaytime02;

public class C02_MethodCreation {

    //Diktortgenin alanini hesaplayan methodu olustur ve kullan

    public static void main(String[] args) {



        //protokol alani
        System.out.println(diktortgeninAlani(5, 10));


    }//main body

    /*

    Acces    static  Data    MethodAdi    (parametler)

    Modifier         type

     */


    public static int diktortgeninAlani(int a,int b){
        // main method static oldugu icin main icindeki herseyin static olmasi gerekiyor
        //method adi Camel case kucuk harf ile baslar sonraki her kelimenin ilk harfi buyuk olur




        return a*b; //carpmanin sonucunu kullaniciya ver

    }


}//class
