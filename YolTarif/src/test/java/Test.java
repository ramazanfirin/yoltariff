import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yoltarif.model.Station;


public class Test {
public static void main(String[] args) {
	System.out.println("geldik");
	try {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:///D:/calismalar/spatial2/YolTarif/src/main/resources/hellowordContext.xml");
//	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	Station a = new Station();
//		stationService.save(a);
		System.out.println("bitti");
}
}
