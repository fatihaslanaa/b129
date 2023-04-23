package mentorteam;

public class MentorWork01 {
    public static void main(String[] args) {

        //B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
        //olmadıgını kontrol etmek !ç!n kod yazınız.
        //Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
        //‘ Ali Can ’ için konsolda false yazmalıdır.
        //‘ Ali Can ’ için konsolda false yazmalıdır.
        //‘Ali Can’ için konsolda true yazmalıdır.

      String str ="Ali  Can";

      String strtrim=str.trim();

      String strtrimbosluksuz= strtrim.replaceAll("\\s ","");

      boolean sonuc = strtrim.length()-strtrimbosluksuz.length()==1;
        System.out.println(sonuc);



    }
}
