package day11loops;

public class ForLoop02NT {
    public static void main(String[] args) {


        //Verilen bir String de 'a' characteri haric tum characterleri  yazdiriniz

      // "Madagaskar "===>


      String s = "Madagaskar";

      //1.YOL
        String t = s.replace("a","");
        System.out.println(t);


        //2.YOL
        for (int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }
        }



        //3.YOL

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                continue;//continue keyword u bazi sartlar icin loop un adimlarini atlamanizi saglar
            }
            System.out.print(ch);
        }



    }

}
