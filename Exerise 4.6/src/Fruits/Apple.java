package Fruits;

	public class Apple extends Fruit implements TotalPrice {
		
		protected int quantity;
		protected double price;
		protected double discount;
		
		public Apple(String n, int q, double p , double d) { // constructor with 4 arguments
			super(n);
			this.quantity = q;
			this.price = p;
			this.discount = d;
			
			if(this.quantity<5) {
				totalPrice();
				System.out.println("Name : " + this.name);
				System.out.println("Quantity: " + this.quantity);
				System.out.println("Price : RM" + this.price);
				System.out.printf("Total price: RM%.2f" , totalPrice());
			}
			else if(this.quantity > 5 && this.quantity < 20) {
				double price = 2.50;		//price
				totalPrice(price);
				System.out.println("Name : " + this.name);
				System.out.println("Quantity: " + this.quantity);
				System.out.println("Price : RM" + price);
				System.out.printf("Total price: RM%.2f" , totalPrice(price));
			}
			else {
				double price = 2.00;// price 
				double discount = 0.35;// discount
				totalPrice(price,discount);
				System.out.println("Name : " + this.name);
				System.out.println("Quantity: " + this.quantity);
				System.out.println("Price: RM" + price);
				System.out.printf("Total price: RM%.2f" , totalPrice(price,discount));
			}
		}
		

		public double totalPrice() { // overloading with 0 parameter
			return  this.price*this.quantity;
		}
		
		public double totalPrice(double price) { // overloading with 1 parameter
			return this.quantity*price;
		}
		
		public double totalPrice(double price, double discount) { // overloading with 2 parameter
			return this.quantity*price*discount;
		}

		public String toString() {  // overriding
			return Factsaboutapple()  ;
			}
					
		public void totalprice() {  // overriding
			// TODO Auto-generated method stub
			
		}
		

	}
