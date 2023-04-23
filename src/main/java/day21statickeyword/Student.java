package day21statickeyword;

public class Student {
    /*
    1-static variable veya static method lar(class member) tum objectler icin ortak elemandir
    2-static class member lar uzerinde yapilan degisiklikler tum objeleri etkiler
    3-static class member lar Class a non static class
        mesela bir classtan 100 tane olusturulur nonstatic olanlar 100 kere olusturulur
        ama static olanlar object sayisindan bagimsiz olarak birkere olusturulur
        4- static class memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non static class lara ulasmak icin
        object sart
        5-static variablarin diger adi Class variable dir
         Non-static variablelarin diger adi "Instance Variable" veya "Object Variable " dir


     */


     public static String stdName = "Tom Hanks";
     public int  age = 13;

     //Ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name){
        String first = name.substring(0,1);
        String second = name.split("")[1].substring(0,1);
        return  first + second;


    }

    //ogrenci ismindeki sesli harfleri (a,e,i,o,u) syan bir methodu olusturunuz

    public  int countVowels(String name){
        int counter = 0;
        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);
            switch(ch){

                case 'a':
                case'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;

    }
}

