package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;

        a = a + 2;
        System.out.println(a);

        a = a + 2;
        System.out.println(a);

        //Increment1
        a = a + 2; // veya a += 2;
        System.out.println(a);//7


        int b = 10;

        System.out.println(b);

        b = b + 5;
        System.out.println(b);


        b += 5;
        System.out.println(b);


        //Decrement

        int c = 8;
        System.out.println(c);

        c = c - 3;//5
        System.out.println(c);


        c -= 3;//3

        System.out.println(c);


        //Increment2

        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12
        d *= 2;
        System.out.println(d);//24


        //Decrement2

        int e = 24;

        System.out.println(e);

        e = e / 2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        //"1" ile increment ve decrement

        int f = 12;

        // f = f + 1;
        //f += 1;
        //f++;

        //"1" ile decrement
        int h = 10;
        // h = h -1;
        //h -= 1;
        //h--;

        //"post increment" ve "pre- increment"

        int i = 10;//

        int k = i++;// post-increment cunku increment variable isminden sonra yazildi
        System.out.println(k);//"i" arttirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur
        System.out.println(i);// "i" satir sonunda arttirildigi icin "i" nin degeri 11 olur
        int m = 15;

        int n = ++m;// pre-increment cunku incement variable nin isminden once yazildi

        System.out.println(m);//16
        System.out.println(n);//16



        //"post - decrement"  ve "pre -decrement "

        //"post-decrement" ve "pre-decrement"
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19







    }
}
