import java.util.Scanner;
 public class IT24102340Lab7Q3{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);

// customer
   for(int Customer = 1; Customer <=5; Customer++){
   System.out.println("Customer"  + Customer);
// Prompt user for Enter Total bill amount
   System.out.print("Enter total bill amount:");
   int Amount = input.nextInt();
// Prompt user for Enter mode payment
   System.out.print("Enter mode payment(C for cash, O for other):");
   char modePayment = input.next().charAt(0);
// Calculate Discount
   double Discount = (Amount*5)/100.0;
// Which customer Can given this discount
   if( modePayment == 'C' ||   modePayment == 'c' )
   {
   System.out.println("Discount is :" + Discount );
   System.out.println("Amount to be paid: " + (Amount - Discount));

   }
   else if(modePayment == 'O' ||   modePayment == 'o')
   {
   System.out.println("No discount applicable" );
   System.out.println("Amount to be paid: " + Amount);

   }
   else
   {
   System.out.println("Payment Mode is Not Valid" );
   }
   

   }
   input.close();
   }
}
   
   

    