import java.util.Scanner;

class Order {
	String order_date;
	String customer_name;
	String customer_email;
	int total_amount;
	int oid;
	String st = "PENDING";

	static int order_id = 0;

	Order() {
		oid = ++order_id;
	}

	public void placeOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order date:");
		order_date = sc.nextLine();
		System.out.println("Enter Customer Name:");
		customer_name = sc.nextLine();
		System.out.println("Enter Customer E-mail:");
		customer_email = sc.nextLine();
		System.out.println("Enter Total Amount:");
		total_amount = sc.nextInt();
		System.out.println("Order is Placed");
	}

	public void viewOrder() {
		System.out.println("------ORDER DETAILS-------");
		System.out.println("Order Number :" + oid);
		System.out.println("Order Date :" + order_date);
		System.out.println("Customer Name :" + customer_name);
		System.out.println("Customer Email :" + customer_email);
		System.out.println("Total Amount :" + total_amount);

	}

	public void updateStatus() {
		st = "COMPLETE";
		System.out.println("ORDER IS COMPLETE");
	}
}

class OrdersArray {
	public static void main(String[] args) {
		Order[] oo = new Order[4];
		for (int i = 0; i < oo.length; i++) {
			oo[i] = new Order();
			oo[i].placeOrder();
		}
		for (int i = 0; i < oo.length; i++) {
			oo[i].viewOrder();
			oo[i].updateStatus();
		}
	}
}