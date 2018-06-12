import java.util.Scanner;

class ShippingInfo
{
	int shippingId;
	String shippingType;
	int shippingCost;
	int shippingRegionId;

	Scanner input=new Scanner(System.in);

	void updateShippingInfo()
	{
		System.out.println("Enter Shipping Id ");
		shippingId=input.nextInt();
		input.nextLine();

		System.out.println("Enter Shipping Type ");
		shippingType=input.nextLine();

		System.out.println("Enter Shipping Cost ");
		shippingCost=input.nextInt();

		System.out.println("Enter Shipping Region Id ");
		shippingRegionId=input.nextInt();
	}
}