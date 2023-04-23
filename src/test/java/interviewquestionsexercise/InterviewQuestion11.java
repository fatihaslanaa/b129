package interviewquestionsexercise;

public class InterviewQuestion11 {
    public static void main(String[] args) {


        // Example2: Size verilen bir String in "Polindrone " olup olmadigini kontrol eden kodu yaziniz
        //           civic , nalan, ==> Polindrone

        ///INterview sorusu

        String duz = "cc";
        String ters = "";

        for (int i = duz.length() - 1; i >= 0; i--) {

            ters = ters + duz.charAt(i);

        }

        if (duz.equalsIgnoreCase(ters)) {
            System.out.println(duz + ":Polindrome'dur");

        } else {
            System.out.println(duz + ":Palindrome degildir");

        }


    }
}
