package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="InvalidUserCredentials")
	
	public Object[][] verifyUserCredentialsData()
	{
		Object data [][]= new Object[3][2];
		
		data[0][0]="44admi";
		data[0][1]="admin";

		data[1][0]="admin";
		data[1][1]="123898";
		
		data[2][0]="admin";
		data[2][1]="admin";


         return data;
				
		
	}

}
