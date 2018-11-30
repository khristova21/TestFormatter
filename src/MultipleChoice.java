/** 
 * fields: String[] AnswerChoices
 * 			char correctAnswer
 * methods: toString(displays properly formatted question)
 * 			getSolution(returns correctAnswer converted to a String)
 * 
 * 
 * @author khristova21
 *
 */
		
		
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	 private char correctAnswer;
	
	public MultipleChoice(String input, char answer, String[] choices)
	{
		super(input);
		correctAnswer = answer;
		answerChoices = choices;
	}

	@Override
	public String getSolution() 
	{
		//casting: char c = (char) 9; 
		return correctAnswer + "";
	}
	
	public String toString() {
		return "Question Number: " + getNumber();
	}
	
	
	
}
