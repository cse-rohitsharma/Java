import java.util.*;

public class circleArea {
    public static void main (String[] args) {
        int radius, diameter, length, breadth, height, radiusCone,slantHeight, side, bracket;
        double area, Area2, Area1;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value of radius");
        radius = s.nextInt();

        area = 3.145 * radius * radius;

        System.out.println("The area of circle is " + area);
        System.out.println("Now enter the length of Rectangle");
        length = s.nextInt();
        System.out.println("And what's breadth");
        breadth = s.nextInt();

        Area1 = length*breadth;
        System.out.println("The area of rectangle is " + Area1);

        System.out.println("Now let's work on cone, what's the radius of cone?");
        radiusCone = s.nextInt();
        System.out.println("And what's its slant height?");
        slantHeight = s.nextInt();

        bracket = radiusCone+slantHeight;
        Area2 = 3.145*radiusCone*bracket;
        System.out.println("Area of cone is " + Area2);



    }
}
