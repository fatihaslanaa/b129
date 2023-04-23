package day11loops;

public class C_04ForLoop {
    public static void main(String[] args) {
        //Ex: 1 den 100 e kadar 6 ile bolunen haric tum tamsayilari
        //ekrana yazdiriniz


        for (int i = 1; i <101 ; i++) {


            if(i%6 == 0){
                continue; //bosveriyor

            }
            System.out.print(i+ " ");

        }

        System.out.println();

        //Interview sorusu
        //Size verilen bir String i  ters ceviren kodu yaziniz

        String str = "fatih";//hitaf

        String ters ="";//yeni bir konteyner olusturduk

        for (int i =str.length() -1; i >-1 ; i--) {
            char harf= str.charAt(i);

            //ters=ters+harf;
              ters+=harf;    //bu sekilde daha iyi
            System.out.println(ters);//herbiradimi gormek icin

        }
        System.out.println(ters);//Sadece sonucu gormek icin






    }

}
