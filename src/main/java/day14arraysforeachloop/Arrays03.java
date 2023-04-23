package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Advance soru Interview ***********
        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz.


        String colors[] = new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));


        //Logic: yeni bir araay olusturup , character sayisi 5 ve 5den kucuk olan
        //elemanlari yeni array e transfer edecegiz Boylelikle yeni arrayde
        // character sayisis 5 den buyuk olan hicbir eleman olmayacak

        //Soru: Hocam , Array olusturmak icin iki sey belirlenmelidir
        // 1) Elaman data type i
        // 2)Yeni array de kac tane eleman olacak

        //Verilen array de eleman sayisi 5 ve 5 den kucuk olan kac eleman var bulmaliyiz




        int counter = 0;

        for(String w : colors){

            if (w.length()<=5){
                counter++;
            }
        }

        String newColor[]= new String[counter];

        int idx=0;

        for(String w : colors){
            if (w.length()<=5){
                newColor[idx]=w;

                idx++;
            }

        }

        System.out.println(Arrays.toString(newColor));





    }
}
