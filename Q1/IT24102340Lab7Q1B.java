import java.util.Scanner;
 public class IT24102340Lab7Q1B{
  public static void main(String[] args){

  // Creat Scanner
     Scanner input = new Scanner(System.in);
 
  // 
     for(int student = 1; student <=3; student++){
     System.out.println("Student" + student);
     System.out.print("Enter Marks : ");
     int Mark1 = input.nextInt();
     int Mark2 = input.nextInt();
     int Mark3 = input.nextInt();
     int Mark4 = input.nextInt();

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
     System.out.println("Overall Garade is :Fail");
     }
     }
     input.close();
     }
}





    
 