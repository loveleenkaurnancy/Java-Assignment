import java.util.Scanner;

class MainClass
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int choice;		
		System.out.println("Enter your choice ");
		System.out.println(" 1. Customer \n 2. Order \n 3. Order Deatils \n 4. Shipping Information \n 5. Shopping Cart \n 6. User \n 7. Administrator");
		choice=input.nextInt();
		switch(choice)
		{
			case 1: Customer c=new Customer();
					c.register();
					break;

			case 2: Order o=new Order();
					o.placeOrder();
					break;
			
			case 3: OrderDetails od=new OrderDetails();
					od.calcPrice();
					break;

			case 4: ShippingInfo si=new ShippingInfo();
					si.updateShippingInfo();
					break;

			case 5: ShoppingCart sc=new ShoppingCart();
					sc.addCartItem();
					break;

			case 6: User u=new User();
					u.verifyLogin();
					break;

			case 7: Administrator a=new Administrator();
					a.updateCatalog();
					break;

			default: System.out.print("Invalid Choice");
		input.close();
		}
	}
}