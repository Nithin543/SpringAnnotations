package springannotations;

import org.springframework.stereotype.Component;

@Component
public class CookieFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "You got couple of Cookies!!!!";
	}

}
