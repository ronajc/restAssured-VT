package restassured;

import org.testng.annotations.DataProvider;

public class ratemyworkspace_main {
	@DataProvider(name="kakashi")
	public Object[] DatatoPost(){ //This is when you want to run same test for multiple data
//		Object[] data = new Object[1];
//		
//		data[1] = 2;
//		data[2] = 3;
//		data[3] = 5;
//		
//		return DatatoPost();
		
		return new Object[] {
			1,1,2
		};
	}
}
