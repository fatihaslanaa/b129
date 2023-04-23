package day05typecastingstringmanipulation;

public class StringManipulationTekrari {

//numeric (sayisal ) data type lar   byte - short - int - long - float - double


    /*
    kucuk data type lari buyuk data type larina cevirmeye Java otomatik olarak yapabilir.
    bu isleme "AutoWidening" denir.

    buyuk data type lerini kucuk data type lerine cevirmek riskli bir istir
    bu islemi java yapmaz kod yazanlar yapar.
    Bu isleme ExplicitNarrowing denir.

     */

    public static void main(String[] args) {



        // byte data tipini int data type ine ceviriniz

        byte  age = 13;
        int ageInt= age;//autowidening


        long weight = 234;
        short weightInt=(short) weight;//Explicit Narowing


       int new1 = 23555;
        System.out.println(new1);
       float newFloat = new1;
        System.out.println(newFloat);



        double earthweight = 244.3434;
        System.out.println(earthweight);
        short population = (short) earthweight;
        System.out.println(population);

        //dikkat!

       short num = 260;
        System.out.println(num);
       byte numbyte =(byte) num;
        System.out.println(numbyte);


        // yer degistirme  // swap

         int a = 12;
         int b = 5;     // swapten once
         int temp = 0;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
         temp = a;
         a = b;
         b= temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);


     // s Stringindeki tum karakterleri buyuk harf yapin.













    }


}
