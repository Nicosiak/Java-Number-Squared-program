/*////////////////////////////////////////////////////////////////////////////*/
import java.util.Scanner; 

public class OutputWithVars {
public static void main(String[] args) {

Scanner scnr = new Scanner(System.in);

int userNum;
int userNum2;
int result;
/////Part 1
System.out.println("Enter a integer:");
userNum = scnr.nextInt();  
    
System.out.println("You entered: " + userNum);
System.out.println(userNum + " squared is " + (userNum * userNum));
System.out.println("and " + "cubed is " + (userNum * userNum * userNum) + "!!");
////Part 2
System.out.println("Enter another integar: ");  

userNum2 = scnr.nextInt();
result = userNum + userNum2;

System.out.println(userNum + " + " + userNum2 + " is " + result);
System.out.println(userNum + " * " + userNum2 + " is " + userNum * userNum2);
}
}



             //////////////////////////////////////////////
            // What the finishd product should look like//
           //------------------Part 1-------------------/
          // Enter integer:                           //
         // You entered: 4                          ///
        // 4 squared is 16                        ////
       // And 4 cubed is 64!!                   /////
      //////////////////////////////////////////////
     //------------------Part 2 --------------/////
    // Enter another integer:                 ////
   // 5                                       ///
  // 4 + 5 is 9                               //
 // 4 * 5 is 20                               /              
//////////////////////////////////////////////


///////////// This is sloppy code without concatenated srings //////////////////

 /*   System.out.println("You entered: " + userNum );
    /////userNum2 = scnr.nextInt();

    System.out.print(userNum);
    
    System.out.print(" squared is ");
    System.out.println(userNum * userNum);
    
    System.out.print("And ");
    System.out.print(userNum);
    System.out.print(" cubed ");
    System.out.print("is ");
    System.out.print(userNum * userNum * userNum);
    System.out.println("!!");
    
   
   
    System.out.println("Enter another integer:");
        userNum2 = scnr.nextInt();
        
   
   
    System.out.print(userNum);
    System.out.print(" + ");
    System.out.print(userNum2);
    System.out.print(" is ");
    System.out.println(userNum + userNum2);
   
    System.out.print(userNum);
    System.out.print(" * ");
    System.out.print(userNum2);
    System.out.print(" is "); 
    System.out.println(userNum * userNum2);
    
      */
 
 //////////////////////////////////////////////////////////////////////////////