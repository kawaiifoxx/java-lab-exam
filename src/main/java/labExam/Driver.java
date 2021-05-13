package labExam;


import java.util.Scanner;

/**
 * This program shows use of Hybrid Inheritance through an calculator app.
 * <p>
 *<code>
 *             {@link ICalculator}<br>
 *            /                    \ <br>
 *{@link IIntCalculator}      {@link IIntOperationProvider}<br>
 *        |                             |<br>
 *        |                             | <br>
 *        |                             | <br>
 *        _______________________________ <br>
 *                      |<br>
 *                      |<br>
 *        {@link IntegerCalculatorImpl}
 *
 *</code>
 *
 * Multilevel and multiple inheritance is combined here.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("This program is a demonstration of hybrid inheritance.");

        System.out.println("1. Addition +");
        System.out.println("2. Subtraction -");
        System.out.println("3. Multiplication *");
        System.out.println("4. Division /");
        System.out.println("5. Modulo %");
        var scanner = new Scanner(System.in);
        String in = scanner.next();
        Integer op1 = scanner.nextInt();
        Integer op2 = scanner.nextInt();

        IIntOperationProvider calculator  = new IntegerCalculatorImpl();
        switch (in) {
            case "+":
                System.out.println("Result: " + calculator.add(op1, op2));
                break;
            case "-":
                System.out.println("Result: " + calculator.subtract(op1, op2));
                break;
            case "*":
                System.out.println("Result: " + calculator.multiply(op1, op2));
                break;
            case "/":
                System.out.println("Result: " + calculator.divide(op1, op2));
                break;
            case "%":
                System.out.println("Result: " + calculator.mod(op1, op2));
                break;
            default:
                System.out.println("Operation Not Defined.");
        }
    }
}
