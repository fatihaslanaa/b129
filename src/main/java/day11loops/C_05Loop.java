package day11loops;

import java.util.Scanner;

public class C_05Loop {
    // 5 den 10 a kadar tamsayilarin toplamini bulan kodu yaziniz.


    public static void main(String[] args) {


     //interview sorusu
        int sum = 0;
        for (int i = 5; i <11 ; i++) {

            sum=sum+i;

        }

        System.out.println("5den 10a kadar sum: "+sum);

      //6 dan 3 e kadar olan tamsayilarin carpimini bulan kodu yaziniz
      // Interview sorusu
        int multiply = 1;

        for (int i = 6; i >2; i--) {
            multiply*=i;

        }
        System.out.println(multiply);










        // Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz

        Scanner input = new Scanner(System.in);
        int num=input.nextInt() ;
        num = Math.abs(num);

        int sonuc = 0;

        for (int i = num; i >0 ; i=i/10) {
            sonuc=sonuc+i%10;
            System.out.println(sonuc);
        }
        System.out.println(sonuc);





    }


    }









