
package Task5;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String orderId;
		 double amount;

		 Order(String orderId, double amount) {
		     this.orderId = orderId;
		     this.amount = amount;
		 }

		 public void printDetails() {
		     System.out.println("Order ID: " + orderId);
		     System.out.println("Amount: ₹" + amount);
		 }
		}

		class OnlineOrder extends Order {
		 String deliveryAddress;

		 OnlineOrder(String orderId, double amount, String deliveryAddress) {
		     super(orderId, amount);
		     this.deliveryAddress = deliveryAddress;
		 }
		 public void printDetails() {
		     
		     super.printDetails();
		     
		     System.out.println("Delivery Address: " + deliveryAddress);
		 }
		}


		public class EcommerceSystem {
		 public static void main(String[] args) {
		     OnlineOrder order1 = new OnlineOrder("ORD123", 2500.75, "Hyderabad, India");
		     order1.printDetails();
		 }
		}
	}

}
