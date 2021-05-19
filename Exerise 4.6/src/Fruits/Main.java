package Fruits;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("********APPLE********");
		Apple obj1 = new Apple("Apple", 8, 3.50, 0.35);
		System.out.println(obj1);
		
		
		System.out.println("\n********GREEN APPLE********");
		GreenApple obj2 = new GreenApple("Green Apple" , 3 , 5.50, "Australia , Soth Africa" , "Year Around" , "Pies" , "Salad");
		System.out.println(obj2);
		
		System.out.println("\n********RED APPLE********");
		RedApple obj3 = new RedApple("Red Apple" , 10, 5.50 );
		System.out.println(obj3);
		
		
		System.out.println("\n********GRAPES********");
		Grapes obj4 = new Grapes("Grapes" , 10 , 10.00, 12.00, 4);
		System.out.println(obj4);

	}

}
