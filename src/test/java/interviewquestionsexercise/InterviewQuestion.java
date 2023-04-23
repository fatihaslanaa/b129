package interviewquestionsexercise;

public class InterviewQuestion {
    public static void main(String[] args) {
        //String karakterleri teker teker yazdiran;
        // Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle = "Ogrenmek yasamin tek kanitidir";

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)=='a'){
                break;
            }

            System.out.println(cumle.charAt(i)+"  ");

        }

    }
}
