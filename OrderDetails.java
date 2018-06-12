import java.util.Scanner;

class OrderDetails
{
	int orderId;
	int productId;
	String productName;
	double quantity;
	double unitCost;
	double subTotal;

	Scanner input=new Scanner(System.in);

	void calcPrice()
	{
		System.out.println("Enter Order Id ");
		orderId=input.nextInt();

		System.out.println("Enter Product Id ");
		productId=input.nextInt();
		input.nextLine();

		System.out.println("Enter Product Name ");
		productName=input.nextLine();

		System.out.println("Enter Quantity ");
		quantity=input.nextDouble();

		System.out.println("Enter Unit Cost ");
		unitCost=input.nextDouble();
		
		subTotal=unitCost*quantity;
		System.out.println("Sub Total " + subTotal);
	}
}