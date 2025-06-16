import java.awt.geom.Area;
import java.util.Scanner;

public class area {
    public static void main(String []args){
       /*
        Scanner s=new Scanner(System.in);
        int b, h, c;
        double a;
        System.out.println("Hii, please enter the height of Triangle");
        h = s.nextInt();
        System.out.println("Now enter the breadth of triangle");
        b = s.nextInt();
        c = b*h;
        a = 0.5 * c;
        System.out.println(a);

        */
        Scanner s=new Scanner(System.in);
        int a, b, c;
        double S, Ar;
        System.out.println("Enter all three sides");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        S = 0.5 * (a+b+c);


        System.out.println("Now semi area is " + S);

        Ar = Math.sqrt(S*(S-a)*(S-b)*(S-c));


        System.out.println("And total area of triangle is " + Ar);

    }

}
