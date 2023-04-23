package day07ifstatement;

import java.util.Scanner;

public class C02_ifStatement {

    public static void main(String[] args) {

        //Kullanici gun numarasini girsin kod gun ismini yazsin

        //1 ==> sunday 2==> monday 5==>tuersday


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen gun numarasini giriniz \n1:sunday 2:monday 2:tuesday 4:wednesday 5:thuesday ");
        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("sunday");

        }else if (gunNo==2){
            System.out.println("monday");

        } else if (gunNo==3){
            System.out.println("tuesday");

        }else if(gunNo==4){
            System.out.println("wednesday");
        }else if (gunNo==5){
            System.out.println("thursday");
        }else {
            System.out.println("lutfen gecerli bir gun numarasi giriniz\n1:sunday 2:monday 3:thuesday 4:wednesday 5:tuesday"  );
        }


    }


}
