// https://youtu.be/H75YOhMAx0I
import java.util.Scanner;
public class ProjectEliza {

	// greet and scan username X
	// add object to use methods created in other class X
	// substring first word and last word of sentence (use .replace) X	
	// '?' prompts the user with a question (add if statement) X
	// '!' and prompts the user with a statement prefixed by “WOW! Dramatic! X
	// '.' or any other character and prompts the user with a statement X
	// Repeats dialogue until user types "EXIT" independent of upper or lower case
	// Confirm the user's intention to exit by prompting them if they want to run
	// program again X
	// if "NO" independent of upper or lower case, say “Goodbye, until next time” X

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
		    PromptBank obj = new PromptBank();    
		
				System.out.println("Hello, my name is Eliza. What is your name?");
		        String username = sc.next();
		        System.out.println("Hello, " + username + ". Tell me what is on your mind today in 1 sentence.");
		        String input;		

		       while(true) {
		    	   input = sc.nextLine();
		    	   		    	   
		    	   String word[] = input.split(" ");
		    	   String firstWrd = word[0];
		    	   String lastWrd = word[word.length - 1];   
		    	   
		    	   if (lastWrd.endsWith("?") || lastWrd.endsWith("!") || lastWrd.endsWith(".")|| firstWrd.endsWith("?")||firstWrd.endsWith("!")||firstWrd.endsWith(".")) {
		    		    lastWrd = lastWrd.replaceAll("[?!.]", "");
		    		    firstWrd = firstWrd.replaceAll("[?!.]", "");
		    		}
		    	  
		    	   
		    	   
		       if (input.endsWith("?")) {
		    	   
		    	   System.out.println(obj.getRandomQuestionTrunk(firstWrd,lastWrd));
		    	   
		       }
		       
		       if (input.endsWith("!")) {
		    	   
		    	   System.out.println("WOW! Dramatic! " + obj.getRandomStatementTrunk(firstWrd,lastWrd));
		    	   
		       }
		       
		       if (input.endsWith(".")) {
		    	   
		    	   System.out.println(obj.getRandomStatementTrunk(firstWrd,lastWrd));
		    	   
		    	   
		       } 
		       
			   if(input.equalsIgnoreCase("exit")) {
				  System.out.println("Do you want to run the session again?");}
				  else if (input.equalsIgnoreCase("no")) {
				    System.out.println("Goodbye, until next time");	
					  break;
				  }
				   
			   }    
			 

	}
	}
