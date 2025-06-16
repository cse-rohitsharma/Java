import java.util.Scanner;

public class roots_Quadratic {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // To find out the roots of quadratic equation
        // Formula root1 = [-b +- sqrt (b*b - 4*a*c)]/2
        System.out.println("Enter a, b, c of the equation respectively");
        int a,b,c;
        double root1,root2,part1,part2,part3;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        part1 = (b*b) - (4*a*c);
        part2 = -b - Math.sqrt(part1);
        root1 = part2/(2*a);

        System.out.println("1st Root is " + root1);
        part3 = -b+ Math.sqrt(part1);
        root2 = part3/(2*a);
        System.out.println("2nd root is " + root2);
        System.out.println("Thanks");


    }
}
