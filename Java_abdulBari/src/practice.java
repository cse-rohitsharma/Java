public class practice {
    public static void main(String [] args){
// Rhombus pattern
        {
            int i, j;
            int n=6;

            // outer loop to handle number of rows
            for (i = 1; i <= n; i++) {

                // inner loop to print spaces
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // inner loop to print stars
                for (j = 1; j <= n; j++) {
                    System.out.print("*");
                }

                // printing new line for each row
                System.out.println();
            }
        }

        }

    }

