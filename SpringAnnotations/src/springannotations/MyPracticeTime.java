package springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeTime {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("configuration.xml");
		CricketCoach c = cpac.getBean("Cricket", CricketCoach.class);
		System.out.println(c.getCandy());
		System.out.println(c.getEmail());
		System.out.println(c.getTeamName());
		cpac.close();
		
	}
}
