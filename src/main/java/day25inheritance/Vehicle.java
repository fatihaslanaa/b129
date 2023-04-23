package day25inheritance;

public class Vehicle {
    /*
    1)Child Class dan bir object olusturdugunuzda Constructor lar en ustteki
    parent class dan baslatilarak alta dogru calistirilir.
    2)CHILD CLASSTAKI CONSTRUCTORDAN PARENT CLASSTAKI CONSTRUCTORA GITMEK ICIN "super()"kullanilir
    3)PARENT CLASSDA BIRDEN FAZLA CONSTRUCTOR VARSA ISTENIEN CONSTRUCTOR,super()ifadesinin parantezi icine yazilan
    parametreler yardimi ile secilebilir.
    4)Ayni class icindeki constructorlari secmek icin this() kullanilir.
    Ayni classta birden fazla constructor varsa istenilen cinstructor, "this()" ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir
    5)super() ifadesini yazmak istege baglidir yazmasanda java varmis gibi davranir ama yazmak tavsiye edilir
    6)super ve this ifadeleri ilk satirda olmali.
    7)Inheritance da variable lari cagirmak icn "this " veya "super " kullanilir
10) Inheritance da object kullanarak method cagirirsaniz, object in constructor^ini temsil eden class"dan method' aramaya baslayiniz. 0 class'da yoksa parent larg bakiniz.
     */

public int price = 12000;


public Vehicle(){
    System.out.println("Vehicle 1");
}
public Vehicle (int price){
    System.out.println("Vehicle 2: " + price);
}
}
