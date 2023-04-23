package englishforloop;

public class ForLoop02 {
    public static void main(String[] args) {
        // Example 1:
        // Type code to print characters except "m" in a String

        String str = "Mama";

        //1.Way
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch != 'm') {
                System.out.print(ch);
            }

        }

        //2.Way
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'm') {
                continue;//if you want to skip any value in loop , use "continue"
            }
            System.out.print(ch);
        }
        System.out.println();

// Example 2 : Type code to print characters before "m" in a String
        //      Luxembourg ==> Luxe

        String city = "Luxembourg";

        for (int i = 0; i < city.length(); i++) {

            char ch = city.charAt(i);

            if (ch == 'm') {

                break;// If you want to break any loop under some conditions, you can use "break" keyword


            }
            System.out.println(ch);

        }
    }
}
