/*Declare a boolean and set it to any value. (true/false)
 Implement the following: If the value is true then add 20 to the variables from ex1 and ex2, then verify and print which variable is greater
 than 30. Else if the value is false then multiply the variables by 10 and print if any of them are multiple of 7.
*/

import java.util.Scanner; // Needed for Scanner class

public class Homework3 {
    public static void main(String[] args) {


        // Create a Scanner object to read input
        Scanner console = new Scanner(System.in);
        // Initialize variables
        boolean truth;
        int var1, var2, var3, var4;

        System.out.print("Enter value of truth: ");
        truth = console.nextBoolean();

        System.out.print("Enter integer var1: ");
        var1 = console.nextInt();

        System.out.print("Enter integer var2: ");
        var2 = console.nextInt();

        System.out.print("Enter integer var3: ");
        var3 = console.nextInt();

        System.out.print("Enter integer var4: ");
        var4 = console.nextInt();

        if (truth) {
            var1 += 20;
            var2 += 20;
            var3 += 20;
            var4 += 20;
            System.out.printf("The numbers are: %d, %d, %d, %d%n", var1, var2, var3, var4);
            if (var1 > 30){
                System.out.println(var1 + " is greater then 30 ");
            }
            if (var2 > 30){
                System.out.println(var2 + " is greater then 30 ");
            }
            if (var3 > 30){
                System.out.println(var3 + " is greater then 30 ");
            }
            if (var4 > 30) {
                System.out.println(var4 + " is greater then 30 ");
            }
        }
        else {
            var1 *= 10;
            var2 *= 10;
            var3 *= 10;
            var4 *= 10;
            System.out.println("The numbers are: " + var1 + ", " + var2 + ", " + var3 + ", " + var4);
            if (var1 % 7 == 0){
                System.out.println(var1 + " is divisible by 7");
            }
            else if (var2 % 7 == 0) {
                System.out.println(var2 + " is divisible by 7");
            }
            else if (var3 % 7 == 0) {
                System.out.println(var3 + " is divisible by 7");
            }
            else if (var4 % 7 == 0) {
                System.out.println(var4 + " is divisible by 7");
            }
        }
    }
}
