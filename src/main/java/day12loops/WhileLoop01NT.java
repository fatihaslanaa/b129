package day12loops;

public class WhileLoop01NT {
    public static void main(String[] args) {

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz


        for (int i = 3; i <7 ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println(  );
        int i = 3;

        while(i <7){
            System.out.print(i+ " ");




            i++;

        }
//Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz


       int k = 23;


        while(k>11){
            if (k%2==0){
                System.out.print(k+ " ");



            }
            k--;






        }
        System.out.println();

      //  43'den 23'ye kadar cift tamsayilari console'a yazdiriniz


     int  l = 43;

        while (l>23){
            if (l%2==0){
                System.out.print(l+ " ");

            }
            l--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
// INTERVIEW SORUSU **onemli soru**

          int num = 578;

          num=Math.abs(num);// eksi deger de girsen onemli degil mutlak deger methodu


          int sum = 0;




         while(num>0){
          sum = sum + num%10;

             System.out.print(sum + " ");



             num/=10;


        }
        System.out.println();








         int num1=354;

         int sum1 = 0;

         while(num1>0){
             sum1= sum1 + num1%10;

             System.out.print(sum1+ " ");



             num1/=10;
         }







    }
}
