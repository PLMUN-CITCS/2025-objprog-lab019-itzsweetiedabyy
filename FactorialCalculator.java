import java.util.Scanner;
public class FactorialCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int number = getNonNegativeInteger(input);

        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: "+ factorial);

        input.close();

    }
    public static int getNonNegativeInteger (Scanner input){
        int number = -1;
        boolean validInput = false;

        while (!validInput){
            System.out.print("Enter a non-negative integer: ");
            if (input.hasNextInt()){
                number = input.nextInt();
                if (number >= 0){
                    validInput = true;
                } else {
                System.out.println("Invalid Input. Please enter a NonNegative Number");
                }
            }else {
                System.out.println("Invalid input. Please enter a valid integer. ");
                input.next();
            }
        }
        return number;
    }
    public static long calculateFactorial(int n){
        if (n == 0) {
            return 1; 
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }

        return factorial;
        
    }
    
}