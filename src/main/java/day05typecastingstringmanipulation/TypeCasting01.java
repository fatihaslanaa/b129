package day05typecastingstringmanipulation;

public class TypeCasting01 {


       /*
          Numeric primitive data typelarinin birbirine donusturulmesi "Type casting " denir

          Numeric Data type lar byte - short - int - long - float - double





          note: Kucuk data type lerini buyuk data type lerine cevirmeyi Java automaticly olarak yapabilir
          Bu isleme "AutoWidening"(otomatik genisleme)

            note2: Buyuk data type lerini Kucuk data type larina cevirmek riskli bir istir,Java bu isi otomatik olarak yapmaz.
                   Bu islemi kod yazanlar yapar
                   Bu isleme "ExplicitNarrowing"(Aciktan daraltma) denir


        */

    public static void main(String[] args) {

        byte age = 13;
        int ageInt = age;//AutoWidening


        //long datay type ini short a cevirelim

        long weight = 234;
        short weightInt = (short) weight;//ExplicitNarrowing oldu


        //int data type ini float a cevir

        int population  =700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        //

        double number = 12.234;
        short numberShort = (short) number;


        //dikkat !
        //Donusum yaptiginiz sayi (260)donuseceginiz data type inin sinirlari disinda ise , Java kullandiginiz sayi ile mood islemi yapr
        //ve mod isleminin sonucu bizim yeni degerimiz olu

        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte)num;
        System.out.println(numByte);//4


        //Example 2:

        short n = 1023;
        byte nByte =(byte)n;
        System.out.println(nByte);//-1








    }

}
