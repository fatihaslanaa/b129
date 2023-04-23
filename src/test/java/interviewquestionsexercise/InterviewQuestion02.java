package interviewquestionsexercise;

public class InterviewQuestion02 {
    public static void main(String[] args) {


        //Swap: Yer degistirmek. 1. kap : Patetes  2. kap: Domates == > Swap 1 kap domates 2. kap patates


        int a = 12;
        int b = 5; // Swapten sonra a nin 5 , b nin 12 Interwiev de sorarlar
        int temp = 0; ///gecici temporary tabak

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        ////1.yol
        //1.adim
        temp = a;
        //2.adim
        a = b;
        //3.adim
        b = temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);


        //2.Yol Interwiev sorusu cozumu


        int x = 12;
        int y = 5;

        x = x + y; //12 + 5 = 17
        y = x - y; //y= 12
        x = x - y; // x= 5


    }

}

