import java.util.Scanner;

//-----------------------------------------------------------------------------------------------------
// If else is used
// Different data types is used
// User input is processed is two different manner
// Problem = while asking for email, user input is not being taken while executing the code




public class carBuy

{ public static void main(String []args){
    System.out.println("Hello, welcome to Spinny");
    String name, carBrand, carModel, address, email;
    long phone;
    int carYear;
    byte correct;
    Scanner s = new Scanner(System.in);
    System.out.println("Kindly tell us your name? Sir!!");
    name = s.nextLine();
    System.out.println("Ohh, Hello " + name);
    System.out.println("Now let us see, which car model you want to sell.");
    System.out.println("Kindly enter the name of car brand?");
    carBrand = s.nextLine();
    System.out.println("Please enter the car model?");
    carModel = s.nextLine();
    System.out.println("One last thing, which year car it is?");
    carYear = s.nextInt();

    if (carYear > 2005) {
        System.out.println(" Yeah! your car is sellable at its highest possible value.");
        System.out.println("Lets get your more details for a callback.");
        System.out.println("Kindly enter your phone number sir.");
        phone = s.nextLong();
        s.nextLine();
        System.out.println("Now let us get your Email.");
        email = s.nextLine();

        // Email is not being taken from user, work it out.
        System.out.println("Thanks for your details.");

        System.out.println("Kindly recheck your final details sir.");
        System.out.print("Your name is " + name);
        System.out.print(" and your contact number is " + phone);
        System.out.print(" and your email is " + email);

        System.out.println(" If its correct kindly enter 1 or else 0");
        correct = s.nextByte();
        if (correct > 0){
            System.out.println("Okay thanks for your details, we will contact you soon.");

        }
        else {
            System.out.println("Alas kindly try again");

        }
    }
    else {
        System.out.println("Sorry, your model is too old to sell.");
        System.out.println("Thanks for visiting us.");

    }

}
}
