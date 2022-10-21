import java.io.*;
import java.util.*;

public class EvalPostfix {

  /***********************************************************
   * main:
   * - repeatedly read in a postfix expression and
   * call method evaluate to evaluate the expression.
   * - program ends when user enters 'q'
   ***********************************************************/
  public static void main(String args[]) {
    Scanner console = new Scanner(System.in);
    String expression;
    int result;

    System.out.println("Enter a mathematical expression in postfix, q to quit");
    expression = console.nextLine();

    while (expression.charAt(0) != 'q') {
      System.out.println("Processing " + expression);

      result = evaluate(expression);

      System.out.println("Value of expression: " + result);
      System.out.println();

      System.out.println("Enter a mathematical expression in postfix, q to quit");
      expression = console.nextLine();
    } // end while
    console.close();

    System.out.println();
    System.out.println("Program ended normally.");

    System.exit(0);
  }

  /*****************************************************************
   * evaluate
   *
   * - evaluates a postfix expression using the algorithm discussed
   * in class.
   ******************************************************************/
  public static int evaluate(String expression) {
    // put your code here.
    Stack operands = new Stack();
    int result = 0;

    for (int i = 0; i < expression.length(); i++) {
      String nextOperand = "" + expression.charAt(i);
      int digit;
      try {
        digit = Integer.parseInt(nextOperand);
        operands.push(digit);

      } catch (NumberFormatException nfe) {
        int A;
        int B;
        char c = nextOperand.charAt(0);
        if (c != ' ') {
          B = operands.pop();
          A = operands.pop();
          if (c == '+') {
            result = A + B;
          } else if (c == '-') {
            result = A - B;
          } else if (c == '*') {
            result = A * B;
          } else if (c == '/') {
            result = A / B;
          }
          operands.push(result);
        }
      }
    }
    return result;
  }

}
