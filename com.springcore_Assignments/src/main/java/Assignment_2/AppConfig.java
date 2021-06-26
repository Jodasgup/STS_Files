package Assignment_2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Question getQuestion() {
		Question ques=new Question();
		ques.setQuestionId("100");
		ques.setQuestion("This is my 1st question");
		
		ArrayList<String> ans=new ArrayList<String>();
		ans.add("This is my ans for first ques");
		ans.add("This is my ans for Second ques");
		
		ques.setAnswer(ans);
		Set<String> ans1=new HashSet<String>();
		ans1.addAll(ans);
		
		ques.setAnswer1(ans1);
		Map<Integer,String> ans2=new HashMap<Integer,String>();
		ans2.put(1, "my feedbake");
		ans2.put(2,"my responsiblbe site");
		ques.setAnswer2(ans2);
		
		return ques;
	}
	

}
