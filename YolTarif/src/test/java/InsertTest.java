

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yoltarif.model.Line;
import com.yoltarif.model.LineWrapper;
import com.yoltarif.model.Station;
import com.yoltarif.model.StationDTO;
import com.yoltarif.service.LineService;
import com.yoltarif.service.StationService;
import com.yoltarif.util.XStreamUtil;






//@ContextConfiguration(locations = "classpath:hellowordContext.xml")
@ContextConfiguration(locations = "file:///D:/calismalar/spatial2/YolTarif/src/main/resources/hellowordContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class InsertTest {

	

@Autowired
StationService stationService;

@Autowired
LineService lineService;
	
	//@Rollback(false)
	//@Ignore
	@Test
    public void prepareData() throws Exception{
		
		//clearDataBase();
		
		Line line = new Line();
		line.setName("E10");
		//lineService.save(line);
		
		Station station = new Station();
		station.setName("Durak1");
		
		Station station2 = new Station();
		station2.setName("Durak2");
		
		Station station3 = new Station();
		station3.setName("Durak3");
		
		
		//lineService.save(line);
		//stationService.save(station);
		
		line.addStation(station);
		line.addStation(station2);
		line.addStation(station3);
		//lineService.save(line);
			System.out.println("bitti");
	}
	
	@Rollback(false)
	//@Test
	public void addData() throws IOException{
		LineWrapper lineWrapper = XStreamUtil.parseTest();
		List<Line> list = lineWrapper.getLineList() ;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Line line = (Line) iterator.next();
			List<StationDTO> stationList = line.getSortedStationList();
			for (Iterator iterator2 = stationList.iterator(); iterator2.hasNext();) {
				StationDTO stationDTO = (StationDTO) iterator2.next();
				String lat = stationDTO.getLat();
				String lng = stationDTO.getLng();
				stationService.
				
				line.addStation(station);
			}
			line.setSortedStationList(null);
			lineService.save(line);
		}
		
	
	}
	
	public void clearDataBase(){
		lineService.clearDatabase();
	}
	
}
