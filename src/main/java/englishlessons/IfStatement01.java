package englishlessons;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //Ex 1:

        char ch = 'S';
        if(ch>='A'&& ch<='Z'){
            System.out.println("Buyuk Harf ");
        }


        //Ex 2:

        byte sayi =20;

        if(sayi%2==0){
            System.out.println("Cift Sayi");
        }


        //Ex3 :

        int num1 =250;

        if(num1<300 || num1>1200){
            System.out.println("harika sayi");

        }

        //Ex 4 :

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi gir");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("cift sayi");
        }
        if(num%2!=0){
            System.out.println("tek sayi");
        }

        //2.yol

        if(num%2==0){
            System.out.println("cift sayi");


        }else{
            System.out.println("tek sayi");

        }


        //Ex5:

        int numara = 105;

        if(numara<0){
            System.out.println("negatif sayi");
        } else if (numara == 0){
            System.out.println("notr sayi");

        }else {
            System.out.println("pozitif sayi");
        }


    }



}

