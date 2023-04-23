package day03scanner;

public class Car {


    public String model = "Corolla";//pasif variable
    public int fiyat = 200000;

    //car calss'inin curly braise i
    public static void main(String[] args) {
        //class ismini yaz #objeye isim verin = new keywordunu kullanin  Class ismini()

        Car                 myCorolla         = new                        Car();

        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();



    }// main'in bodysi

    public void hareket(){//Aktif ozellikler
        System.out.println("Toyota hizli hareket eder");

    }

    public void dur (){//Aktif ozellikler methodlar
        System.out.println("Toyota guvenle durur");

    }

}
