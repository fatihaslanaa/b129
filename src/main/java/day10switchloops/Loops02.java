package day10switchloops;

public class Loops02 {


    public static void main(String[] args) {

        //Example 21 den 180 e kadar hem 4 hem 6 ile bolunebilen tamsayi lari ekrana yazdiran kodu yaziniz


        for(int i = 21;    i<181       ;i++ ){
            if(i%4==0 && i%6==0){
                System.out.println(i + " ");
            }
        }




        //Example 2:
        //Note Yazdiginiz kod belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu kodlara
        // Hard-code denir (Hard code yalnis )yazilmis bir koddur mutlaka duzeltilmelidir
        // Bir String'de son index ==length() - 1 s.length() ile yapariz formulunu
     String s = "ankara";
        for(int i=0; i<s.length();  i++    ){

            String ch = s.substring(i, i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }




    }
}
