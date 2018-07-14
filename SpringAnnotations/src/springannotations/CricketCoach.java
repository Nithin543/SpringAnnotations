package springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Cricket")
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String teamName;
	
	public String getEmail() {
		return email;
	}

	@Value(value = "${email}")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	@Value(value = "${teamName}")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Autowired
	public CricketCoach(@Qualifier("cookieFortuneService") FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	public String getPracticeInfo() {
		return " Cricket : Practice for 3 hours a day ";
	}
	
	public String getCandy() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public String initMethod() {
		System.out.println("In Init Method");
		return "";
	}
	
	@PreDestroy
	public String destroyMethod() {
		System.out.println("In Destroy Method");
		return "";
		
	}
	/*public void doJunk(FortuneService fortuneService) {
		System.out.println("In Setter Method");
		this.fortuneService = fortuneService;
	}*/

}
