import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner console = new Scanner(System.in);
        // Initialize variables
        int var1;

        //get var1 from user input
        System.out.print("Enter var1: ");
        var1 = console.nextInt();
        switch (var1){
            case 2:
                System.out.println("Var1 este egala cu 2");
                break;
            case 13:
                System.out.println("Var1 este egala cu 13");
                break;
            case 98:
                System.out.println("Var1 este egala cu 98");
                break;
            case 365:
                System.out.println("Var1 este egala cu 365");
                break;
            default:
                System.out.println("Var1 nu este egala cu: 13, 2, 98, 365 ");
        }
    }
}

