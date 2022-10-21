import java.io.*;
import java.util.*;

public class EvalPostfix
{
  
  
  /***********************************************************
   * main:
   *  - repeatedly read in a postfix expression and
   *    call method evaluate to evaluate the expression.
   *  - program ends when user enters 'q'
   ***********************************************************/
  public static void main( String args[] )
  {
    Scanner console = new Scanner(System.in);
    String expression;
    int result;
    
    System.out.println( "Enter a mathematical expression in postfix, q to quit" );
    expression = console.nextLine();
    
    while ( expression.charAt( 0 ) != 'q' )
    {
      System.out.println( "Processing " + expression );
      
      result = evaluate( expression );
      
      System.out.println( "Value of expression: " + result );
      System.out.println();
      
      System.out.println( "Enter a mathematical expression in postfix, q to quit" );
      expression = console.nextLine();
    } // end while
    
    System.out.println();
    System.out.println( "Program ended normally." );
    
    System.exit(0);
  }
  
  
  
  /*****************************************************************
   * evaluate
   *
   * - evaluates a postfix expression using the algorithm discussed
   *   in class.
   ******************************************************************/
  public static int evaluate( String expression )
  {
	  //put your code here.
  }
  
}
