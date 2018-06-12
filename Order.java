import java.util.Scanner;

class Order
{
	int orderId;
	String dateCreated;
	String dateShipped;
	String customerName;
	String customerId;
	String status;
	String ShippingId;

	Scanner input=new Scanner(System.in);

	void placeOrder()
	{
		System.out.println("Enter OrderId");
		orderId=input.nextInt();
		input.nextLine();

		System.out.println("Enter Date Created");
		dateCreated=input.nextLine();

		System.out.println("Enter Date Shipped");
		dateShipped=input.nextLine();

		System.out.println("Enter Customer Name");
		customerName=input.nextLine();

		System.out.println("Enter Customer Id");
		customerId=input.nextLine();

		System.out.println("Enter Status");
		status=input.nextLine();

		System.out.println("Enter Shipping Id");
		ShippingId=input.nextLine();
	}
}