package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //3 den 10 a kadar tamsayilari ayni satira yazdiran kodu yaziniz
// 1.Yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        //2.Yol

        System.out.println();

        int i = 3;//baslangic degeri
        while (i < 11) { //bitis degeri
            System.out.print(i + " ");
            i++;//arttirma while loop un icinde
        }

        // 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int a = 17;
        while (a > 3) {
            if (a % 2 == 0) {//cift sayi istedigimiz icin
                System.out.println(a + " ");

            }
               a--;//if in disina yazilmali decremnent
        }
    }
}

