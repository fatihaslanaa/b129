package interviewquestionsexercise;

public class InterviewQuestion03 {
    public static void main(String[] args) {


        //Interview sorusu:
        //Ex 9 : Bir String deki tekrarsiz characterleri ekrana yazdiriniz
        //       abbcccdc  ==>  ad(tekrarsiz olanlardir)

        String y = "abb";

        char ch = y.charAt(0); //a

        if (y.indexOf(ch) == y.lastIndexOf(ch)) {
            System.out.println(ch);
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);

        }
    }
}
