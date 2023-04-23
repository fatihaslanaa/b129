package englishforloop;

public class ForLoop01 {


    public class ForLoops {
        public static void main(String[] args) {

            //Example1: Type to reverse a String
            //          For Example: Tom ==>moT
            String name = "Mark";
            String reversedName = "";

            for (int i = name.length() - 1; i >= 0; i--){
                char ch = name.charAt(i);

                reversedName = reversedName + ch;

            }

            System.out.println(reversedName);

//Example 2:


            int sum = 0;
            for (int i=3;i<7;i++){

                sum=sum + i;
            }
            System.out.println(sum);

            //Example 3:


            int multiplication = 1;
            for (int i = 3;i<7;i++){
                multiplication = multiplication * i;
            }
            System.out.println(multiplication);


//Example4: 584==> 5+8+4=17 Type code to find the sum of the digits of an integer
// Interview question
            //Note " number % 10 " gives you the last digit

            // int num = -584

            //Math abs method


            int sumOfDigits = 0;

            for (int i = 584;i>0;i=i/10){

                sumOfDigits = sumOfDigits + i%10;

            }

            System.out.println(sumOfDigits);


        }









    }

}
