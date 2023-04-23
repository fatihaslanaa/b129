package day25inheritance;


public class Honda extends Car {

    public int price = 10000;
    public Honda(){

    System.out.println("Honda 1");
    }

    public Honda(String model , int year){
      ;//super yazmasinizda ayni is olur parametre koyucaksak gerekli.
        System.out.println("Honda 2:" + model + " - " + year);
    }


}
