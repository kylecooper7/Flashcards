import java.util.ArrayList;
import java.util.Scanner;

public class FlashcardsDriver
	{
		static Scanner StringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		
		static int numberOfTimesRight = 1;
		static boolean cardsLeft = true;
		static ArrayList <Integer> listOfRandomNumbers = new ArrayList <Integer>();
		
		public static void main(String[] args) throws Exception
			{
				// TODO Auto-generated method stub
	
	System.out.println("Which set would you like to practice?");
	SetList.LoadSetList();
	for(int i = 0; i < SetList.listOfSets.size(); i++) {
		System.out.println(SetList.listOfSets.get(i));
	}
	String theirInput = StringInput.nextLine();
	
	for(int i = 0; i < SetList.listOfSets.size(); i++) {
		if(SetList.listOfSets.get(i).substring(0, theirInput.length()).equals(theirInput)) {
			dataLoader.LoadTheFlashcards(SetList.listOfSets.get(i).substring(theirInput.length() + 2, SetList.listOfSets.get(i).length()) );	
		}
	}
	
	
	
while(QuestionAsker.cardsLeft) {
	QuestionAsker.askQuestions();
	
	
}
	System.out.println("Congrats. You've mastered this set.");
	

	
	


			}

	}
