package interviewquestionsexercise;

public class InterviewQuestion05 {
    //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
// INTERVIEW SORUSU **onemli soru**
    public static void main(String[] args) {


    int num = 578;

    num=Math.abs(num);// eksi deger de girsen onemli degil mutlak deger methodu


    int sum = 0;




         while(num>0){
        sum = sum + num%10;

        System.out.print(sum + " ");



        num/=10;


    }
        System.out.println();

}
}
