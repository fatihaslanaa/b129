package day24accessmodifiersinheritance;

public class Animal {

    /*
Inheritance 'in faydalari;
1) Code standacdinda tekcac iyi degildic. Y
2) Code degisime açik olmalidir.Hatay düzettmek kolay olmall.
3) Gelisime update'e ack olmalidir
4) Code atomic yapida olmali.
Note 1: "parent class" (super class) (ortak ozellikleri icerir)-"child class"(sub class) (Class'g ozel ozellikleri icerir)
Note 2: Bir parent class' bagli child class'1 belirtmek igin "extends" keyword kullaniraz
Note 3:Public methodlar child class lar tarafindan kullanilabilir.
       "child classlar " tarafindan kullanilabilir demek inherit edilebilir
Note 4:  protected methodlar inherit edilebilir
        Cunku "protected" olan method ve variable lar child lar tarafindan kullanilabilir.
Note 5 : Default methodlar objec ile ayni pacgage de olduklari surece inherit edilebilir
ama default method ile object in uretildigi class farkli pacge lerde ise inherit edilemez
Note 6 : "private methodlar " inherit edilemezler
Note 7: Java birden fazla parent i (multiple inheritance java tarafindan desteklenmez)onaylanamz.
Note 8 : Child-->Parent-->Grand parent-->Grand Grand Parent.... seklinde ilerleyen inheritance lara "Multi level Inheritance" denir.
Note 9: Javada object class tum Java Class larin ortak parentidir
NOTE 10 : Javada Object class haric tum classlarin parent i vardir
Note 11:  Javada parenttan child a olan iliskilerde Has-A Relaitionship denir
           Javada child parentta a olan iliskilerde Is-A Relaitionship denir
Note 12:   Javada her class in bir tane default constructor i vardir
Bu defauld constructor class in icinde gorunmez cunku default constructor Object class icindedir
bizim class imiz default constructor a ihtiyac duydugunda parent olan object class a gider aradaki constructro i kullan

     */

    protected  void eat() {
        System.out.println("Animals eat...");
    }
     void drink() {
            System.out.println("Animals drink...");
        }
}



