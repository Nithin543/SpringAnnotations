package springannotations;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TENNISCoach implements Coach{

	@Override
	public String getPracticeInfo() {
		// TODO Auto-generated method stub
		return "Tennis: Practice 4 hoursa day";
	}

}
