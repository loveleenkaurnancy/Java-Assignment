import java.util.Scanner;

class Customer
{
	String customerName;
	String address;
	String email;
	String creditCardInfo;
	String shippingInfo;

	Scanner input=new Scanner(System.in);

	void register()
	{
		System.out.println("Enter Customer Name");
		customerName=input.nextLine();

		System.out.println("Enter Address");
		address=input.nextLine();

		System.out.println("Enter Email");
		email=input.nextLine();

		System.out.println("Enter Credit Card Information");
		creditCardInfo=input.nextLine();

		System.out.println("Enter Shipping Information");
		shippingInfo=input.nextLine();
	}

	void login()
	{
		System.out.println("Enter Email");
		email=input.nextLine();

		System.out.println("Enter Credit Card Information");
		creditCardInfo=input.nextLine();
	}

	void updateProfile()
	{
		System.out.println("Enter Customer Name");
		customerName=input.nextLine();

		System.out.println("Enter Address");
		address=input.nextLine();

		System.out.println("Enter Email");
		email=input.nextLine();

		System.out.println("Enter Credit Card Information");
		creditCardInfo=input.nextLine();

		System.out.println("Enter Shipping Information");
		shippingInfo=input.nextLine();
	}
}