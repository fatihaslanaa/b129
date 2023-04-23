package day04memorykullanimiwrapperclassascii;

public class C04_WrapperClass {

    /*
    Non-Primitive data turleri  sadece data barindirmak icin degil
    ayni zaman da methodlarda bulundurur
    Primitive data turleri ise sadece deger saklar
    java bu duruma bir cozum uretmistir.
    Her primitive data Non primitive olarak  olusturmak
    icin ozel calss lar olusturmustur.
    Oracle firmasinin urunu olan java
    primitivlere method ekleyerek olusturduklari bu yeni yapiya
    Wrapper Class adini vermistir


    Primitive         Wrapper

      byte   ==>       Byte
      short  ==>       Short
      int  ==>         Integer *****
      long  ==>        Long
      float   ==>      Float
      double  ==>      Double
      boolean  >       Boolean
      char   ==>       Character *****







     */

    public static void main(String[] args) {

        byte primitiveByte= 12;//primitive data type larinda nokta koydugumuzda hicbir method gelmez
        Byte wrapperByte= 12;//wrapper classlarda nokta koydugumuzda bircok method kullanabiliriz



        //Ex : byte data typeinin en kucuk ve en buyuk degerini ekrana yazdirin


        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE); // 127



        //Ex; short, int ,long data typelarinin max ve min degerlerini hesaplatan kodu yaziniz


        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Long.MIN_VALUE);//2147483647
        System.out.println(Long.MAX_VALUE);//9223372036854775807



      //////*********Primitiv'ler Wrapper Classlar'a nasil cevrilir?(Cevirinin ismi Autoboxing'dir ismi )*********


        float f1 = 13.99F;// bu primitive data type dir kucuk kutu olusturdum
        //wrapper class yapicak asagida** (huge memoryde olan yani)

        Float wrapperF1 = f1;


         ////**** Wrapper Class lari  Primitive  Data type ina nsil cevrilir (Unboxing yapicaz (kucuk degeri buyuk kutunun icinden cikar ))
        Character w1 = 's';
        char primitiveW1= w1;
        //Note autoboxing ve Unboxing java tarafindan otomatik yapilir.
        //Ekstra kod yazmay gerek yoktur.

        //Ex: Verilen iki String datanin toplamini veren kodu yaziniz

        String str1= "12345";
        String str2= "6754";


        System.out.println(str1+str2);//123456754 **yanyana yazdi


        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//19099 ** ValueOf toplar(Integer. basip goruruz)


    }

}
