import java.util.Scanner;

public class expressions {

        public static void main(String []args){
            // % to get remainder
            // ("/") to get quotient

            // in arithmetic operations, Priorities are given as follows;
            // / > * > %
            // + -
            // division > multiplication > mod > addition > subtraction

            // Parenthesis () is used for changing the priority order of Expressions
            // now let's write algorithm for (a+b)square formula

            int a, b, c;
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter the first number");
            a = s.nextInt();
            System.out.println("Kindly enter the another number");
            b = s.nextInt();

            c = a*a + b*b + 2*a*b;

            System.out.println("The answer is" + c);


            // byte + byte    = int
            // byte + short   = int
            // short + short  = int
            // int + int      = int
            // short + int    = int
            // internally, compiler converts byte & short into int and read them as integer.
            // this internal conversion process is known as coercion
            // int + float    = float
            // long + float   = float
            // char + short   = int
            // char + int     = int
            // float + double = double
            // long + double  = double
            double a1;
            long a2;
            long a3;


            System.out.println("Now lets work on different data types.");
            System.out.println("Enter any decimal number.");

            a1 = s.nextDouble();

            System.out.println("Now enter your phone number");
            a2 = s.nextLong();
            a3 = (long) (a1 + a2);

            System.out.println("Here is your result of inputs " + a3);



        }
    }


