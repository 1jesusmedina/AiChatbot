// https://youtu.be/H75YOhMAx0I

import java.util.Random;
import java.util.Scanner;

public class PromptBank {
	
	Random random = new Random();
	private String statements[] = new String [8];
	private String questions[] = new String [8];
	
	public PromptBank() {
		
		String statements[] = new String [8];
		String questions[] = new String [8];
		populateStatementsArray();
		populateQuestionsArray();
	}

	public void populateStatementsArray() {
		
		statements[0] =	"BLANK1 seems important to you, so does BLANK2 Please tell me more.";
		statements[1] =	"BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[2] =	"I love that you care about BLANK1 and BLANK2. please share what else is on your mind.";
		statements[3] =	"BLANK1 and BLANK2 are good things to think about. Im curious to hear more";
		statements[4] =	"BLANK1 and BLANK2 are great. Tell me more.";
		statements[5] = "BLANK1 and BLANK2 are amazing. Im interested in hearing more.";
		statements[6] =	"BLANK1 and BLANK2 seem to excite you. I would love to hear more.";
		statements[7] =	"BLANK1 seems significant to you, so does BLANK2. Please tell me more";
	
	}

	public void populateQuestionsArray() {
		        
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "How often do you think about BLANK1 and BLANK2?";
		questions[4] = "Is BLANK1 and BLANK2 things you think about a lot?";
		questions[5] = "In what ways does BLANK1 and BLANK2 affect you?";
		questions[6] = "Are you more curious about BLANK1 ? or BLANK2?";
		questions[7] = "When was the last time you thought about BLANK1 or BLANK2?";						
		
	}

	public String getRandomStatementTrunk(String firstWord, String lastWord){
	    
        
        int number = random.nextInt(statements.length);
		String statement = statements[number];	
		statement = statement.replace("BLANK1", firstWord);
        statement = statement.replace("BLANK2", lastWord);
        return statement;
	}



    public String getRandomQuestionTrunk(String firstWord, String lastWord){
	
	int number = random.nextInt(questions.length);
	String question = questions[number];	
	
	question = question.replace("BLANK1", firstWord);
    question = question.replace("BLANK2", lastWord);
    return question;
		
}




}

		
	
	
	
