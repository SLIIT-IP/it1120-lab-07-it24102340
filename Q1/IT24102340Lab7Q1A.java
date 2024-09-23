import java.util.Scanner;
 public class IT24102340Lab7Q1A{
  public static void main(String [] args){
    
   // Creat scanner
      Scanner input = new Scanner(System.in);
   // Enter four subject mark 1
      System.out.print("Enter Subject Mark 1:");
      int Mark1  = input.nextInt();
      
   // Enter four subject mark 2
      System.out.print("Enter Subject Mark 2:");
      int Mark2  = input.nextInt();
      
   // Enter four subject marks
      System.out.print("Enter Subject Mark 3:");
      int Mark3  = input.nextInt();
      
   // Enter four subject marks
      System.out.print("Enter Subject Mark 4:");
      int Mark4  = input.nextInt();
      
   // Calculate  the average 
      double average = (Mark1 + Mark2 + Mark3 + Mark4 )/4;
      
   // Print average
      System.out.println("Average is :" + average );
      
   // 
      if(average >= 75 ){
      System.out.print("Overall Garade is :Distinction");
      }
      else if(average >= 50){
      System.out.print("Overall Garade is :Credit");
      }
      else{
      System.out.print("Overall Garade is :Fail");
      }
    

      input.close();
      }
}


