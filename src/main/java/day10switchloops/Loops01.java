package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

   //Example 1 : Ekrana 5 kere "Hi " yazdirin

   /*
   Code Standarts
   i)Tekrar (Repetition)olmamalidir
   ii)Dynamic olmalidir.
   iii)Tamir (Fix) ve update koolay yapilabilmelidir.


    */
       // 1.yol Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

     //2.yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektigfinde "Loop" lar kullanilir
        //Dort tane loop var; i)for-loap ii)while - loop iii)do-while-loop iv)for-each-loop

        //i)for loop
        // baslangic degeri      Loop un    calisma sarti      Increment/decrement
      // for(int i =1         ;     i<5                          ;i++                 ) {


          // System.out.println("H");


           //example 1 ; 11 den 44 e kadar tum tam sayilari ekrana yazdiran kodu giriniz

           for(int i=11; i<15; i++) {
               System.out.println(i);
           }



        //example 1 ; 40 den 23 e kadar tum tam cift tamsayilari ekrana yazdiran kodu giriniz

         for(int i=40; i>22; i--){
             if(i%2==0)
             System.out.println(i);
         }



         //Example 4:  //example 1 ; 18 den 56 e kadar tum tek  sayilari ekrana yazdiran kodu giriniz

        for(int i = 18; i<57;i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }






    }
}



