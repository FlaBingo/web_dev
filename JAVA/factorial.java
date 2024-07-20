import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        // Taking user input
        // int num = scanner.nextInt();
        System.out.println("Enter 1 for Summation \nEnter any number for Factorial");
        int result = Integer.parseInt(scanner.nextLine());
        if(result==1){
            System.out.println("Enter a number to add from 0 to : ");
            int m= Integer. parseInt(scanner.nextLine());
            System.out.println(sum(m));
        }
        else{
            System.out.println("Enter a non-negative integer to calculate its factorial:");
            int m= Integer. parseInt(scanner.nextLine());
            System.out.println(fact(m));
        }

        scanner.close();
    }

    // Recursive method to calculate factorial
    private static long fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);


        }
    }
    // Recursion mathod to calculate summation
    static int sum(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
    }

    }
}
