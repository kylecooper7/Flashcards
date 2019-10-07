import java.util.Scanner;

public class QuestionAsker
	{
		static Scanner StringInput = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		static int theScore = 0;
		static boolean cardsLeft = true;
		public static void askQuestions() {
			for(int i = 0; i < dataLoader.theSet.size(); i++) {
				FlashcardsDriver.listOfRandomNumbers.add(i);
			}
			
			while(FlashcardsDriver.listOfRandomNumbers.size() > 0) {
				
				int randomNum = (int) Math.random() * FlashcardsDriver.listOfRandomNumbers.size();
				FlashcardsDriver.listOfRandomNumbers.remove(randomNum);
				System.out.println(dataLoader.theSet.get(randomNum).getQuestion());
				String theirAnswer = StringInput.nextLine();
				if(theirAnswer.equals(dataLoader.theSet.get(randomNum).getAnswer())) {
					System.out.println("Nice! Next Question.");
					dataLoader.theSet.get(randomNum).setScore(dataLoader.theSet.get(randomNum).getScore() + 1);
				}
				else {
					System.out.println("Wrong! Next Question.");
					dataLoader.theSet.get(randomNum).setScore(dataLoader.theSet.get(randomNum).getScore() - 1);
				}
				if(dataLoader.theSet.get(randomNum).getScore() == FlashcardsDriver.numberOfTimesRight) {
					dataLoader.theSet.remove(randomNum);
					}
				for(int i = 0; i < dataLoader.theSet.size() ; i++) {
					theScore = theScore + dataLoader.theSet.get(i).getScore();
				}
			}
			if(dataLoader.theSet.size() == 0) {
				cardsLeft = false;
			}
			
		}
		
	}
