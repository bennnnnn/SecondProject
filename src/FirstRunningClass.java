import java.util.Scanner;

public class FirstRunningClass {

		public static void main(String[] args) {
			 
			
			 // Create a scanner object
			
			Scanner scan = new Scanner(System.in);
			
			String response; // This holds users response
			
			System.out.println("Would you like to continue? "  );
			
		     response=scan.nextLine(); // Accept user answer.
			
			
			while(true){
				
			if(response.equalsIgnoreCase( "y")){  // if the response is "y" the program continues.
				System.out.println("Enter a string");
				scan.nextLine();
			}
			
			else if(response.equalsIgnoreCase("n"))  // if the response is "n" the program quits.
				System.exit(0);
			else 
				System.out.println( "Wrong choice. Enter again."); // if the user puts other than "y" or "n", a message will appear to the user to enter again.
			      scan.nextLine();
			
			
			
			}

		}

	}

/**  Aligorithim
 * 
 1. scan variable references Scanner object
2.	print “would you like to continue?”
3.	set the response to response variable
4.	if response equals “y”, prompt the user again.
5.	if response equals “n”, exit the program.
6.	if response not equals “n” or “y”, prompt the user again.

 * 
 * 
 *  Seudocode
 *  
 * 
 •	Create a scanner class object
•	Declare a string variable that holds a user response.
•	Prompt the user  with “Would you like to continue?”
•	Accept the user’s response
•	If the response is “y”, the program prompts the user again to enter a response. 
•	Accept the user’s response again.

•	If  the response is “n”, the program will quit
•	If  the user’s response is other than “y” or “n”, show the user error message. And prompt the user to enter response again. 
•	Read the response. 

 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

