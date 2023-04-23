package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        int a = 12; // Bu yapinin icinde sadece bir tane data depolanabilir

        //Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin java array yapisini olusturmustur



        // Array nasil olusturulur?
        // Array olusturmak icin "Array elemanlarinin "data type" i ve "eleman sayisi" mutlaka yazdirilmalidir

        String stdNames[] = new String[5];



        //Array console a nasil yazdirilir
        //toString methodunu kullanmadn sadece array ismi ile yazdirirsaniz Java o Arrayin adresini yazdirirz
        System.out.println(Arrays.toString(stdNames));//null yazdirir 5 adet

         //Array e eleman ekleme

        System.out.println(Arrays.toString(stdNames));//[null,null,Ajda,null,null]

        stdNames[2]= "ajda";
        stdNames[0]= "cuneyt";
        stdNames[1]= "kemal";
        stdNames[3]= "ezel";
        stdNames[4]= "besir";
        System.out.println(Arrays.toString(stdNames));

        //Arraydan specifik bir eleman alma
        System.out.println(stdNames[2]);


        //Ex 1: Arraydeki her elemani sonina ! isareti koyarak ekrana yazdir

        for (int i = 0; i< stdNames.length ; i++) {

            System.out.println(stdNames[i] + "!");

        }








    }
}
