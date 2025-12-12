package restassuredapi_1;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class dummydata {
	
	@Test 
	
	void data()
	{
		Faker av = new Faker();
		String fullname = av.name().fullName();
		String number = av.phoneNumber().cellPhone();
		System.out.println(fullname);
		System.out.println(number);
	}
	

}
