import java.util.Scanner;

class MainClass
{
	public static void main(String args[])
	{
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter yout choice ");
		System.out.println(" 1. Customer \n 2. Orders \n 3. Order Deatils \n 4. Shipping Information \n 5. Shopping Cart \n 6. User \n 7. Administrator");
		choice=input.nextInt();
		switch(choice)
		{
			case 1: System.out.println("A");
					break;
		}
	}
}