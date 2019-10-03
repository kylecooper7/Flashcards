
public class FlashCard
	{
		private String question;
		private String answer;
		private int score;
		
		public FlashCard(String q, String a, int s) {
			question = q;
			answer = a;
			score = s;
		}

		public int getScore()
			{
				return score;
			}

		public void setScore(int score)
			{
				this.score = score;
			}

		public String getQuestion()
			{
				return question;
			}

		public void setQuestion(String question)
			{
				this.question = question;
			}

		public String getAnswer()
			{
				return answer;
			}

		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
		
		
		
		
		
	}
