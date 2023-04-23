package selfstudy;

import java.util.Scanner;

public class SelfStudyOrnek {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int number = scan.nextInt();



        if (number % 2 == 0) {
            System.out.println("sayi cifttir");



        }else{
            System.out.println("sayi tektir");
        }


        System.out.println();



        int num = 578;
        num= Math.abs(num);
        int sum = 0;

        while (num>0){



           sum= sum+num%10;

           num=num/10;



        }
        System.out.println(sum);


        System.out.println();


//     Bir Stringde benzersiz tekrarsiz karakterler yazdirmak icin kod yaziniz
        //Heo
         String s = "Hello";

         int i = 0;

         while (i<s.length()){

         String c = s.substring(i, i+1);

         if (s.indexOf(c)==s.lastIndexOf(c)){

             System.out.print(c);




         }
             i++;


         }


















    }
}



