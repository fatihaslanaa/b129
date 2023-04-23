package interviewquestionsexercise;

public class UcgenSorusu {
    public static void main(String[] args) {


        for (
                int i = 1;
                i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 1 && j == 5) {
                    System.out.print("*");
                } else if (i == 2 && (j == 4 || j == 6)) {
                    System.out.print("*");
                } else if (i == 3 && (j == 3 || j == 7)) {
                    System.out.print("*");
                } else if (i == 4 && (j == 2 || j == 8)) {
                    System.out.print("*");
                } else if (i == 5 && (j % 2 == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}