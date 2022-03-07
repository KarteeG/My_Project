package parama;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para {
	
	@Test
	@Parameters({"username","password"})
	private void demo(@Optional("karthick")String username,@Optional("pass@123")String password) {
		
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ password);
		
		Assert.assertEquals(username, "karthick");
		
		System.out.println("Data Verified");
		

	}

}
