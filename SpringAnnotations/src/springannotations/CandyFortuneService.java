// This is CandyFortuneService Class
package springannotations;

import org.springframework.stereotype.Component;

@Component
public class CandyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You got couple of candys!!!!";
	}
	
}
