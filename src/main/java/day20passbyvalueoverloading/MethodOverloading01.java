package day20passbyvalueoverloading;

public class MethodOverloading01 {
/*    interview da sorabilirler
   1- Method Overloading yaparken method ismi degistirilmez
   2- Method Overloading yaparken parametreler  degistirilir
   i)Parametre degistirilirken parametrelerin data type lari degistirilebilir
   ii)Parametre degistirirken, "parametrelerin data type larin farkli ise yerleri degistirilebilir"
   iii)Parametre degistirirken, "parametrelerin sayisi degistirilebilir.
   3- Java icin "ismi" ve "parametreleri " ayni olan iki method tamamiyla aynidir
      Bu yuzden "ismi" ve "parametre" "Method Signature" olarak adlandirilir.
   4-Method Overloading olusrtururken return type i degistirmewnin hicbrir etkisi yoktur
      Method Overloading olusrtururken access modifier i degistirmewnin hicbrir etkisi yoktur
      Method Overloading olusrtururken methodu static veya non-static i yapmanin hicbrir etkisi yoktur
      Method Overloading olusrtururken methodu method body i degistirmenin hicbrir etkisi yoktur

    5) "private" method s can be overloaded.Cunku method overloading sadece bir class in icinde olur
     "private" olmak ise baska class lara gidildiginde problem olusturulur.

    6) "static" methodlar overload edilebilirler.
     
   */
    public static void main(String[] args) {

       add (3,5);

    }

    private static void add(int a, int b){
        System.out.println(a+b);
    }


    private  void add(double a, double  b){
        System.out.println(a+b);
    }
    
    private  void add(double a, int b){
        System.out.println(a+b);
    }

    private  void add(int a, double b){
        System.out.println(a+b);
    }

    public  void add(int a, int b , int c){
        System.out.println(a+b);
    }
    

}
