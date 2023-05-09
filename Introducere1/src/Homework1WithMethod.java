/*Exercise 1:
Declare 3 integer variables. Then initialize with any value.
Implement the following:
If one of the variables is a multiple of 5 and one or more variables are equal to 13, print the smallest value of the 3.
If more than one variable is multiple of 5 print all variables that are greater than 7.
If none of the variables are multiple of 5, multiply by 3  all variables then print the smallest value and the sum of the other 2.
*/

// Solution using methods

import java.util.Scanner; // Needed for Scanner class

public class Homework1WithMethod {

    // method to get the max from the three variables
    static int maxOfThree(int a, int b, int c){
        int largest = a;
        if(b > largest) largest = b;
        if(c > largest) largest = c;
        return largest;
    }

    // Getter method
    public int getMaxOfThree(int a, int b, int c) {
        return maxOfThree(a, b, c);
    }


    // method to get the min from the three variables
    static int minOfThree(int a, int b, int c){
        int lowest = a;
        if(b < lowest) lowest = b;
        if(c < lowest) lowest = c;
        return lowest;
    }

    //Getter method
    public int getMinOfThree(int a, int b, int c){
        return minOfThree(a, b, c);
    }

    // method to get the medium from the three variables
    static int midOfThree(int a, int b, int c){
        int mid;
        {
            // Checking for b
            if ((a < b && b < c) || (c < b && b < a)) {
                mid = b;
                return mid;
            }
            // Checking for a
            else if ((b < a && a < c) || (c < a && a < b)) {
                mid = a;
                return mid;
            }
            else
                mid = c;
            return mid;
        }
    }


    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner console = new Scanner(System.in);
        // Initialize variables
        int var1, var2, var3;
        int max, mid, min;

        //get var1 from user input
        System.out.print("Enter var1: ");
        var1 = console.nextInt();
        //get var2 from user input
        System.out.print("Enter var2: ");
        var2 = console.nextInt();
        //get var1 from user input
        System.out.print("Enter var3: ");
        var3 = console.nextInt();
        System.out.println("The variables are: " + var1 + ", " + var2 + ", " +  var3);


        // initialize and store the truth values for divisible by 5
        boolean a = var1 % 5 == 0;
        boolean b = var2 % 5 == 0;
        boolean c = var3 % 5 == 0;


        // verify condition that none of the variables are divisible by 5
        if (var1 % 5 != 0 && var2 % 5 != 0 && var3 % 5 != 0) {
            // if non is divisible by 5, multiply all by 3
            var1 *= 3;
            var2 *= 3;
            var3 *= 3;
            System.out.println();
            System.out.println("Caz 1 - nici o var nu este divizibila cu 5");
            System.out.println("===========================================");
            System.out.println("Variabilele multiplicate cu 3");
            System.out.println("Variabila 1 are valoarea: " + var1);
            System.out.println("Variabila 2 are valoarea: " + var2);
            System.out.println("Variabila 3 are valoarea: " + var3);

            // call all methode to get min, mid and max number
            min = minOfThree(var1, var2, var3);
            mid = midOfThree(var1, var2, var3);
            max = maxOfThree(var1, var2, var3);
            // print the small one and the sum of the two other
            System.out.println();
            System.out.println("Cel mai mic numar este: " + min );
            System.out.println("Suma celorlalte 2 este: " + mid + " + " + max + " = " + (mid + max) );

        }
        // verify condition that at least two of the variables are divisible by 5
        else if (a && b || b && c || a && c){
            // if true print that we have at least two vars divisible by 5
            System.out.println();
            System.out.println("Cazul 2 - Avem cel putin 2 var divizibile cu 5");
            System.out.println("===============================================");
            // check which variable is greater than 7
            if (var1 > 7){
                System.out.println(var1 + " este mai mare decat 7");
            }
            if (var2 > 7){
                System.out.println(var2 + " este mai mare decat 7");
            }
            if (var3 > 7){
                System.out.println(var3 + " este mai mare decat 7");
            }
        }
        else{
            // if none of the above conditions are met then
            System.out.println();
            System.out.println("Cazul 3 - Avem o var divizibila cu 5");
            System.out.println("===========================================");
            if (var1 == 13 || var2 == 13 || var3 == 13){

                // call all methode to get min, mid and max number
                max = maxOfThree(var1, var2, var3);
                min = minOfThree(var1, var2, var3);
                mid = midOfThree(var1, var2, var3);

                System.out.println();
                System.out.println("Sortarea var este: " + min + "," + mid + "," + max);
                System.out.println("Avem cel putin o var egala cu 13, deci afisam cel mai mic numar: " + min );
            }
            else
                System.out.println();
            System.out.println("Nu avem nici o variabila egala cu 13, deci nu afisam cea mai mica variabila" );
        }

    }
}
