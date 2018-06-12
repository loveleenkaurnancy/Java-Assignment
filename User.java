import java.util.Scanner;

class User
{
	String userId;
	String password;
	String loginStatus;

	Scanner input=new Scanner(System.in);

	void verifyLogin()
	{
		System.out.println("Enter User Id");
		userId=input.nextLine();

		System.out.println("Enter Password");
		password=input.nextLine();

		if(userId.equals("30") && password.equals("qwerty"))
		{
			loginStatus="true";
			System.out.println("Valid Username & Password");
			System.out.println("Login Status " + loginStatus);
		}
		else
		{
			loginStatus="false";
			System.out.println("Invalid Username & Password");
			System.out.println("Login Status " + loginStatus);
		}

	}
}