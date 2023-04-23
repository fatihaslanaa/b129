package day04asciiwrapperclassoperatormemoryusageNt;

public class WrapperClass {

    public static void main(String[] args) {

       // int n = 12; //primitive i) "n" yazip nokta koyarsak hic method goremeyiz cunku primitivler method icermez

        //Integer m = 12; //Wrapper Class "m" yazip nokta koyarsak bircok method goruruz cunku wrapper classlar method icerir



        //Ex: 1 short data tipinin min ve max degerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        //Ex2: int data type in min degeri ile byte data type in max degeri top


        int IntMin  = Integer.MIN_VALUE;
        int IntMax =  Integer.MAX_VALUE;


        //Ex 3 i) Primitive int i Wrapper Integara cevirirniz

        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum);//22
        // ii) Wrapper Byte i primitive byte a cevirelim
        // Unboxing dir

        Byte f = 43;
        byte primitivef = f;
        System.out.println(primitivef);


        //Ex 4 : Primitive chari wrapper karaktere ceviriniz(AutoBoxing)
        //       Wrapper Boolean  primitive boolen a ceviriniz(Unboxing)

        char initial = 'F';
        Character initialWrapper = initial;


        //2 inci ornek cozumu

        Boolean isOld = true;
        boolean isOldWrapper = isOld;




    }


}
