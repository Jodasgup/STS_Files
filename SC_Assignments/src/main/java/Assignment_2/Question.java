package Assignment_2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private String questionId;
	private String question;
	private List<String> answer;
	private Set<String> answer1;
	private Map<Integer,String> answer2;
	
	public Map<Integer, String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Map<Integer, String> answer2) {
		this.answer2 = answer2;
	}
	public Set<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Set<String> answer1) {
		this.answer1 = answer1;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + ", answer1="
				+ answer1 + ", answer2=" + answer2 + "]";
	}
	

	
	
}
