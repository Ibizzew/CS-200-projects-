import java.util.Scanner;

public class LeapYearProgram {

public static void main (String[] args){
Scanner scanner = new Scanner(System.in);

while(true) {

System.out.print("Enter a year (0 to exit):");
int year = scanner.nextInt(); // Replace with the desired year
 
 if (year == 0) {
 break;
 }
 
 
if(isLeapYear(year)) {
System.out.println("Given "+ year +" is a leap year.");

} else {

System.out.println ("Given "+ year +" is not a leap year.");

}
}
}


public static boolean isLeapYear(int year){


if( year < 0) {
System.out.println("Please enter a valid positive year. please try again");

}



if (year % 4 == 0 ) {
 
  if (year % 100 == 0){
   
    if (year % 400 == 0){
 
 return true;
 
 }else{
 
 return false;
   }
 }else{
 
 return true;
   }
 }else{
 
 return false;
 
 }
 }
 }
 