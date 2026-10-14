import java.util.Scanner;
public class Finance{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int  scholarshipPerMonth, savings, tuitionFee, rentPerMonth, extraExpensesPerMonth;
int totalincome, totalspending;
System.out.println("Enter amount of scholarship:");
scholarshipPerMonth=in.nextInt();     
System.out.println("Enter amount of savings:");
savings=in.nextInt(); 
System.out.println("Enter the tuition fee per semester");
 tuitionFee = in.nextInt();
  System.out.println("Enter the rentPerMonth");
 rentPerMonth = in.nextInt(); 
System.out.println("Enter the extraExpensesPerMonth");
 extraExpensesPerMonth = in.nextInt();
totalincome=(scholarshipPerMonth*12)+savings;
totalspending=(tuitionFee*2)+(rentPerMonth*12)+(extraExpensesPerMonth*12);
System.out.println("The total income is"+totalincome+"and the total spending is"+totalspending);
}
}