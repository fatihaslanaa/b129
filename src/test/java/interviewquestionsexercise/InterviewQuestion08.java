package interviewquestionsexercise;

public class InterviewQuestion08 {
    public static void main(String[] args) {

        // 5 den 8 e kadar tamsayilarin stoplamini veren kodu yaziniz
        //  5+6+7+8==> 26  *****toplami bul dendiginde en son degeri anlariz.

        ///INTERVIEW QUESTIONS
        int  sum = 0;// int e 0 vermemiz gerek her zaman baslangic degerine yani

        // her seferinde 1 arttiracak
        for (int i = 5; i <9 ; i++) {

            sum= sum + i;


        }
        System.out.println(sum);


        //7 den 9 a kadar tamayilarin carpimini veren kodu yaziniz.
        //   Interview sorusu



        int multiply =1;

        for (int i = 7; i <10 ; i++) {

            multiply=multiply*i;


        }
        System.out.println(multiply);




    }

}


