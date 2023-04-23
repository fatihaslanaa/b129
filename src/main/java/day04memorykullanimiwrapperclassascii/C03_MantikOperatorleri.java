package day04memorykullanimiwrapperclassascii;

public class C03_MantikOperatorleri {

    //10< sayi Mantik Operatoru sayi<20;
    //== = tek esittir atam (assigment)yapar


    /*

    Java uclu karsilastirmalar kabul etmez.
    Ikili karsilastirmalar yapip Mantik operatorleriyle birlestirmeliyiz

    && == ve and || buda or veya operatoru demek

    &&

    Cay ve Limon
    +   &&  +     = true
    +   &&  -     = false
    -   && +     = false
    -   && -     = false


   &&       ile      &
   &&'de boolean sonucta bir tane false bulunca durur
   &' de ise tum satiri tarar sonra durur
   buda &&' nin &'den  daha hizli calismasini saglar



   || veya operatoru Polyanacidir.En ufak bir poziflikten true doner

     Cay veya Limon

      +  ||   +     = true
      +  ||   -     = true
      -  ||  +     = true
     -   || -     = false



     */

    public static void main(String[] args) {


        System.out.println(5+2 == 8);

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println(sonuc1);//true


        boolean sonuc2 =  5>4 && 7>9 && 6+3 == 9 && 5+2==7;
        System.out.println(sonuc2);//false




        int sayi1 = 15 ;

        System.out.println(10<sayi1 && sayi1<20);//true



        int  sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true







    }


}
