package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java Cumlesi = Statement
        //Java'da "==" demek , Yani Matematikte "=" Java'da "=="
        //Access Modifier yazmazsaniz "Default" demektir
        //Data Type + Varible Name ==> Variable Declaration
        //Assigment Operator(Atama Operatoru) + Variable degeri
        //Default Degerler sayilar icin sifirdir.
        //Data Type ini yaziniz    Variable ismi yaziniz      Assignment operator      Variable degeri   ingilizcedeki nokta gibi
             int                          age                         =                        13              ;


             // ornek 1: ogrenci ismi variable olusturp deger olarak Ali Can atayiniz
             // Stringlere deger verirken cift tirnak icinde olmalidir.
             //Stringler icin "default value" "null" dir
             String studentName = "Ali Can";


             /*
             java'da temelde iki tip data vardir;
             1)primitive data type (ilkel) \

                      char: Tek karakterler icin kullanilir. A, x, ?, 5,
                      - boolean: boolen'lar sadece iki farkli deger  alblirler; true or false
                      - byte: -128'den +127 e kadar tam sayi degerleri  icin kullanilir (memory'yi cok az kullanir)(1byte)

                       -short: - 32768 ile 32767 arasinda tam sayilar icin kullanilir (2 byte)
                       - int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir(4 byte)
                       - long: 9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir(8byte)
                         float
                       - double
             2)non-primitive data type (gelismis)

              */

        //ornek2: char data type inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note: Char data type inda tek tirnak icine konulur tekli karakter oldugu icin ;
        char isminIlkHarfi = 'A';

        //ornek3: boolean data type'inde emeklimisn icin bir variable olusturun  ve false degeri atayin
        boolean emeklimisin = false;

           //ornek4:byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;
          //ornek5 site nufusu icin bir variable olusturup deger atayiniz
         short siteNufusu = 1200;

         //orne6 Ulke nufuslari icin bir variable lar olusturp deger atamasi yapiniz
        int countryPopulation = 1864378385;

        //ornek7: insan vucudundaki hucre sayisi icin variable olusturp deger atamasi yapiniz
        //note bir deger long ise sonuna "L" veya "l" konulur ise kizmaz hata vermez
        long cellNumberInHumanBody = 477487646476090094L;
                //Eger longlara atatiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yoktur
         long weightOfSun = 12342424;
         





    }

}





