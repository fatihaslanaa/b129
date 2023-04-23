package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {



        /*

                  Username = "admin" Password = "pwd123"dur.
                  Kullanicidan username ve passwordu alin.
                  username ve password dogru ise "Hesabiniza hocheldiniz"
                  username ve password yalnis ise 3 kere "Username ve passwordunuzu giriniz" mesaji versin
                  username ve password 4. kere yalnis girirlirse hesabiniz bloke olmustur " mesajo vererek islemi tamamlayiniz



        */



        Scanner input = new Scanner(System.in);


        int counter = 0;

        do {
            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }


            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'u giriniz");
            String password = input.next();


            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniz'a hosgeldiniz");
                break;
            }
            counter++;
        }while (true);





    }
}
