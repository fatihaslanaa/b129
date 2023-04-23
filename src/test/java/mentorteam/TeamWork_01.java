package mentorteam;

public class TeamWork_01 {
    // Example 1: Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
// Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
    public static void main(String[] args) {
        int[]numbers = {-12, 18, -5, 23, -2};

        int minPositive =Integer.MAX_VALUE;
        int maxNegative =Integer.MIN_VALUE;

        for(int number : numbers){

            if (number > 0 && number < minPositive){
                minPositive=number;

            } else if (number<0 && number> maxNegative) {

                maxNegative = number;

            }

        }
        System.out.println("En kucuk positive element is " + minPositive);
        System.out.println("En buyuk negative element is " + maxNegative);





    }

}
