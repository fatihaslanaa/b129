package englishlessons;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        int num = input.nextInt();

        if(num>0){
            System.out.println("pozitif");
        } else if (num<0) {
            System.out.println("negatif");

        }else {
            System.out.println("notr");
        }


    }
}


