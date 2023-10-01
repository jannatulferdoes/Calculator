import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double n1, n2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        n1 = input.nextDouble();

        System.out.println("Enter second number");
        n2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}