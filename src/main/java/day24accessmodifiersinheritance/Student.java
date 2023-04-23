package day24accessmodifiersinheritance;

public class Student {
    public  String name = "Tom Hanks";
    // name herkes trafndan bilinir public oyuzden
    String stdId = "TH2023HU12001";
    // student id okul yonetimideki insanlar tarafindan bilinebilir default yaptim
    protected int accountNum = 83769372;
    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir
    private int balance = 123000;//
/*
interview sorulari
1- Access modifer lar genisden dara public > protected > default > private
2- Class lar protected ve private olamazlar sadece public ve default olabilirler

i)publicler icin hicbir sinirlama yoktur projenin her yerinden vlasilabilir
ii)protected ani packagein icinden ya da farkli packagelard o packagedeki cocuklar vlasabilir.
iii)default sadece ani packageden vlasilabilir. Bu yuzden defaultlarin diger adi package private'dir private
iv)"private" sadece class icinde ulasilabilir class disina cikilmadiginda ulasilamaz
v)protected ile defaultun farki nedir ?
Package dising ciktigimizda childlardan protectedlara vlasabiliriz. Defaultlarda Ulasamayiz.
 */


}
