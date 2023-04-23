package interviewquestionsexercise;

public class question13 {
    public static void main(String[] args) {


        //Interview sorusu
        //Size verilen bir String i  ters ceviren kodu yaziniz

        String str = "fatih";//hitaf

        String ters = "";//yeni bir konteyner olusturduk

        for (int i = str.length() - 1; i > -1; i--) {
            char harf = str.charAt(i);

            //ters=ters+harf;
            ters += harf;    //bu sekilde daha iyi
            System.out.println(ters);//herbiradimi gormek icin

        }
        System.out.println(ters);//Sadece sonucu gormek icin


    }
}
