package enumpack;

public class EnumDemo3 {
//declare variables and methods
	enum Month1
	{
		JAN,FEB,MAR,APR,MAY;
		int price=100;
		
		public int getPrice()
		{
			return price;
		}
	}
	public static void main(String[] args) {
		Month1 m = Month1.JAN;
		System.out.println("Month is: "+m);
		System.out.println("price is: "+m.getPrice());
		
		//switch
		
	}

}
