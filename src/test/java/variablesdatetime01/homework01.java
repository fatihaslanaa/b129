package variablesdatetime01;

import java.util.Scanner;

public class homework01 {

    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Adiniz= ");
        String name=input.next();


        System.out.println("Soyadiniz= ");
        String surname=input.next();

        System.out.println("Yasiniz=" );
        Integer age=input.nextInt();

        System.out.println("Kilonuz=");
        Float weigh =input.nextFloat();

        System.out.println("Boyunuz=");
        Integer heigt= input.nextInt();

        System.out.println("Kac ay devam edeceksiniz=");
        Integer month = input.nextInt();

        System.out.println("Adiniz= "+name);
        System.out.println("Soyadiniz= "+surname);
        System.out.println("Yasiniz= "+age);
        System.out.println("Kilonuz= "+weigh);
        System.out.println("Boyunuz= "+heigt);
        System.out.println("Toplam ucretiniz=" +month*20);














    }




}
