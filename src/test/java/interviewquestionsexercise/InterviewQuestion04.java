package interviewquestionsexercise;

public class InterviewQuestion04 {
    public static void main(String[] args) {


    //Example4: 584==> 5+8+4=17 Type code to find the sum of the digits of an integer
// Interview question
    //Note " number % 10 " gives you the last digit

    // int num = -584

    //Math abs method


    int sumOfDigits = 0;

        for (int i = 584;i>0;i=i/10){

        sumOfDigits = sumOfDigits + i%10;

    }

        System.out.println(sumOfDigits);


}

}
