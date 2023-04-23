package day21statickeyword;

public class StdRunner {

    public static void main(String[] args) {

        System.out.println (Student.stdName);

        Student std1 = new Student();
        System.out.println(std1.age);


      String initials=  Student.getInitials("Tom Cruise");
        System.out.println(initials);

        int vowels = std1.countVowels("Fatih Kubra");
        System.out.println(vowels);

        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Alex Sandra");
        System.out.println(s);


    }
 }
