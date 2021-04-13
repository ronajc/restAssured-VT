package restassured;

import org.testng.annotations.DataProvider;

public class add_occupant_main {
	
	@DataProvider(name = "kakashi")
	public Object[] data() {
		return new Object[]
		                  {1,"abc@gmail.com", "male", 7777777777L, "vishal", 123};
		                  
		                  
				
	}
}
