package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example1: String array olustur icine 5 tane eleman
        // ekleyin ilk eleman ile son elemanin
        //icerdigi karakter sayilari toplami ekrana yazdirin

        String arr[]= new String[5];

        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length());

        //Example1: String array olustur icine 5 tane eleman
        // ekleyin tum elemanin
        //ecerdigi karakter sayilari toplami ekrana yazdirin

        String brr[]= new String[5];

        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Frankfurt";
        brr[3]="Dhaka";
        brr[4]="Athena";

        //1.Yol
        int totalChar = 0;

        for (int i = 0; i<brr.length ; i++) {

            totalChar=totalChar + brr[i].length();




        }


        System.out.println(totalChar);//32



        //2.Yol for-each loop(enhanced loop) ==> baslangic degeri ,
        // loop un calisma sarti inc dec kismini kendisi halleder

        // for-each loop "Array"ve "collection " larda kullanilir
        //Index killanmaniz gerektiginde bazen "for eac loop"careiz kalir mecburen digerlerini kullanir

        int sum =0;

        for(String w : brr){
            sum = sum + w.length();

        }
        System.out.println(sum);


        int arr1[] = {1, 2, 3}; int arr2[] = {1, 2, 3};
        int arr3[] = {3, 2, 1};
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1==arr1);
        System.out.println(Arrays.equals(arr1, arr3));

        System.out.println();




    }
}
