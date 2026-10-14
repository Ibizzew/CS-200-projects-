import java.util.Scanner;
  public class finitesum {
 
  public static void main (String[] args) {
  
  
 int n, result;
  
 Scanner input = new Scanner(System.in);
 System.out.println("Finding the sum of 1 to n intgers");
 System.out.println("Enter the Value of n: ");
 n= input.nextInt();
  
  
  
  result =(n*( n + 1 ))/2;
  
 System.out.println("The Sum from 1 to "+ n +" = " + result);
 
  
  }
  }