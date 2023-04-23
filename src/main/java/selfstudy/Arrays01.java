package selfstudy;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfElement= input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

        String stdNames[]= new String[numOfElement];

        for (int i = 1; i <=numOfElement ; i++) {
            System.out.println("Lutfen "+ i + ". ogrencinin adini giriniz");
            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            stdNames[i=1]=stdName;
        }
        System.out.println(Arrays.toString(stdNames));

    }

}
