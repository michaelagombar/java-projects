import java.util.InputMismatchException;
import java.util.Scanner;


public class MyConverter {

  
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double cm = -1;
       while(cm==-1){
       cm = convertToCentimeters(scan);
      
       if(cm!=-1){
       System.out.println("Your result = " +cm);
       }
       else{
           System.out.println("Please enter the values again.");
       }
       scan.nextLine();
       }
   }
   public static double convertToCentimeters(Scanner scan){
       double centimeters = -1;
       try{
           double foot = getFootValue(scan);
           double inch = getInchValue(scan);
           double totalinchs = foot * 12 + inch;
           centimeters = totalinchs* 2.54;
          
           }catch(NegativeNumberException e1){
               System.out.println(e1);
           }
           catch(NonDigitNumberException e2){
               System.out.println(e2);
           }
           return centimeters;
   }
   public static double getFootValue(Scanner scan) throws NegativeNumberException, NonDigitNumberException{
       try{
       System.out.println("Enter the foot value: ");
       double foot = scan.nextDouble();
       if(foot <= 0){
           throw new NegativeNumberException ("A Negative foot value has been entered");
       }
       return foot;
       }
       catch(InputMismatchException e){
           throw new NonDigitNumberException ("A Non-Digit foot value has been entered.");
       }
   }
   public static double getInchValue(Scanner scan)throws NegativeNumberException, NonDigitNumberException{
   try{
       System.out.println("Enter the inch value: ");
       double inch = scan.nextDouble();
       if(inch <= 0){
           throw new NegativeNumberException ("A Negative inch value has been entered");
       }
       return inch;
       }
       catch(InputMismatchException e){
           throw new NonDigitNumberException ("A Non-Digit inch value has been entered.");
       }
   }
}