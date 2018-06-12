import java.util.Scanner;

class ShoppingCart
{
	int cartId;
	int productId;
	int quantity;
	String dateAdded;
	char choice;

	Scanner input = new Scanner(System.in);

	void addCartItem()
	{
		System.out.println("Enter Cart Id ");
		cartId=input.nextInt();

		System.out.println("Enter Product Id ");
		productId=input.nextInt();

		System.out.println("Enter Quantity ");
		quantity=input.nextInt();
		input.nextLine();

		System.out.println("Enter Date ");
		dateAdded=input.nextLine();

		System.out.println("Update Quantity (Y/N)");
		choice=input.next().charAt(0);

		if(choice=='Y' || choice=='y')
		{
			updateQuantity();
		}
		else
		{
			System.out.println("NON UPDATED");
		}

		viewCartDetails();
	}

	void updateQuantity()
	{
		System.out.println("Enter New Quantity ");
		quantity=input.nextInt();
		viewCartDetails();
	}

	void viewCartDetails()
	{
		System.out.println("\n\nCART DETAILS");
		System.out.println("Cart Id " + cartId);
		System.out.println("Product Id " + productId);
		System.out.println("Quantity " + quantity);
		System.out.println("Date " + dateAdded);
		checkOut();
	}

	void checkOut()
	{
		System.out.println("\nCHECKOUT");		
	}
}