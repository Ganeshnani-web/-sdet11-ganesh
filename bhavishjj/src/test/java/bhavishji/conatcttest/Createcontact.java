package bhavishji.conatcttest;

import org.testng.annotations.Test;

public class Createcontact
{

	@Test
	public void createcontact(String name , String num)
	{
		System.out.println("create contact");
	}
	
	@Test
	public void modifycontact(String cont)
	{
		System.out.println("modify contact");
	}

	@Test
	public void deletecontact()
	{
		System.out.println("delete contact");
	}


}
