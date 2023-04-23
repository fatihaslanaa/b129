package day11loops;

public class ForLoop03NT {
    public static void main(String[] args) {

        // Size verilen bir String i tersten yazdiriniz
        //INTERVIEW SORUSU bu soruyu bilmeden girme is gorusmesine

        // "Germany "===> ynamreg

        String s = "Java";

        String t = "";

        for(int i=s.length()-1;i>=0; i--){

            t = t+ s.charAt(i);



        }
        System.out.print(t);

        // Example2: Size verilen bir String in "Polindrone " olup olmadigini kontrol eden kodu yaziniz
        //           civic , nalan, ==> Polindrone

       ///INterview sorusu

       String duz = "cc";
       String ters = "";

       for(int i=duz.length()-1;i>=0; i--){

           ters=ters + duz.charAt(i);

       }

       if(duz.equalsIgnoreCase(ters)){
           System.out.println(duz+":Polindrome'dur");

       }else {
           System.out.println(duz+":Palindrome degildir");

       }



    }
}
