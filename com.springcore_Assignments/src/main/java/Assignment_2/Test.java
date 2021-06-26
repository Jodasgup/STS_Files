package Assignment_2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Question question= context.getBean("getQuestion",Question.class);
		
		System.out.println(question);

	}

}
