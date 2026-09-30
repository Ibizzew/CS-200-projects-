import java.util.Scanner;


/*Problem 2: Password Retry (Using while loop)
Write	a	program	that	asks	the	user	to	enter	the	password	'JavaRocks'.	The	program	should	
keep	asking	until	the	correct	password	is	entered.

se	a	`while`	loop.
Bonus:	Add	a	limit	of	3	tries	and	print	a	lockout	message	if	they	fail	3	times.
*/

public class Task2 {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
String i = ""; 
boolean cond = true;
int counter = 3;

while(cond == true) {
   

   System.out.println("AskPassword:");
   i = input.nextLine();
   
   if(i.equals("JavaRocks")){
   System.out.println("Welcome! Username and Password have been validated");
   cond = false;
    }   
   else{
      counter--;
      System.out.println("Wrong");
      // make a couner i need 3 times for it to lock out some one
      };
      

   if (counter == 0 && !i.equals("JavaRocks")) {
        System.out.println("Maximum number of attempts exceeded");
        break;
        }
      
      
              
}
}
}