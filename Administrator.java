import java.util.Scanner;

class Administrator
{	
	String adminName;
	String email;

	Scanner input=new Scanner(System.in);

	void updateCatalog()
	{
		System.out.println("Enter Admin Name");
		adminName=input.nextLine();

		System.out.println("Enter Email");
		email=input.nextLine();
	}
}