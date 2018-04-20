import java.util.Scanner;
public class QuestionTest {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        String operation;

        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Enter Operation (+, -, *, /): ");
        operation = scanner.next();
// User inserts the given operators. so that it get result connecting to the Main java
        Main calculator = new Main(firstNumber, secondNumber);
        {
            if (operation.equals("+")) {
                System.out.println(calculator.add());
            }
            if (operation.equals("-")) {
                System.out.println(calculator.minus());
            }
            if (operation.equals("*")) {
                System.out.println(calculator.multiply());
            }
            if (operation.equals("/")) {
                System.out.println(calculator.divide());
            }

        }
    }
}

