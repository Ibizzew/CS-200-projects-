import java.util.Scanner;
public class PolynomialEvaluation {
   public static void main(String[] args) {
   double x,result;
   Scanner in = new Scanner(System.in);
     System.out.println("enter the x: ");
     x = in.nextDouble();
     result = 2.1 * (x*x*x) + 3.7 * (x*x) - 3;
      System.out.println("f(" + x + ") =" +result);
} 
}