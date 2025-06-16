import java.util.*;

public class First{
    public static void main(String[] args){

        String name;

        Scanner s=new Scanner(System.in);
        System.out.println("May I know your name?");
        name = s.nextLine();

        System.out.println("Welcome " + name);



    }
}


/*{
    public static void main(String []args){
        Scanner n=new Scanner(System.in);
        int S = n.nextInt();
        if (S<40){
            System.out.println("Fail");
        }
        else{
            if (S>=40 && 60<=S){
                System.out.println("Pass");
            } else if (S>=60 && 75<=S) {
                System.out.println("Good");
            }
            else {
                System.out.println("Excellent");
            }

        }

    }
}
*/