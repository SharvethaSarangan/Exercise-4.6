package Fruits;

	public abstract class Fruit {
		
		protected String name;
		
		public Fruit(String n) {
			this.name = n;
			System.out.println(name + " constructor is invoked");
		}
		
		public String Factsaboutapple() { // constructor with argument
			return "\n\n---FACTS ABOUT FRUITS---" +
		               "\nIn common language usage, “fruit” normally means the fleshy seed-associated structures of a " +
		               "\nplant that are sweet or sour, and edible in the raw state, such as apples, bananas, grapes, lemons, " +
		               "\noranges, and strawberries." +
					   "\nBotanically, a cereal grain, such as corn, rice, or wheat, is also a kind of fruit."+
					   "\nFruits are important sources of dietary fibre, vitamins (especially vitamin C), and antioxidants." ;
				}
	

		public double TotalPrice() {
			return 0;
		}


		}


