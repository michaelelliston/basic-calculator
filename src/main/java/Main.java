import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        String input = myScanner.nextLine();

        double firstNumber = Double.parseDouble(input);

        System.out.println("Enter the second number:");
        String inputTwo = myScanner.nextLine();

        double secondNumber = Double.parseDouble(inputTwo);

        System.out.println("The answer is: " + firstNumber * secondNumber + '.');

    }
}
