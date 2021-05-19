package Fruits;

	public class RedApple extends Apple {
		
		public RedApple(String n , int q , double p) {
			super(n ,q , p, p);
		    }

		public double totalPrice(double p) {  // overloading with 1 parameter
			return this.price ;
		}
		
		public double totalPrice(int q , double p ) {  //overloading with 2 parameters
		return this.price * this.quantity ;
			}
		
		public String toString() { // overriding 
			return " \nWe can use apple to make pies" ;

	}
	}

