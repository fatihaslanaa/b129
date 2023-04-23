package day22staticblocksconstructors;

public class StaticBlocks01 {
//Bir variable olusturdugunuzda deger atamazsaniz o variable i "initialize"etmediniz demektir.
    //static variable lar static block lar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmis olur
    // bazen main method calistirilmadan once variable larin hazir hale getirlmesi gerekir bu yuzden stati block lar kullanilir

    static  double pi;
    static  String shape;



    static{
        pi = 3.14;
        System.out.println("Static block 1");
    }

    static{
        pi = 3.14;
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        pi = 3.14;
        System.out.println("main method");

    }




}
