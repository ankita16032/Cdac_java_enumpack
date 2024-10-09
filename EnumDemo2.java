package enumpack;
enum Month1
{
	JAN,FEB,MAR,APR,MAY;
}
public class EnumDemo2 {

	public static void main(String[] args) {
		Month1 m =Month1.JAN;
		System.out.println(m);
		//System.out.println(Month1.MAR);
		switch(m)
		{
		case JAN : System.out.println("This is first month of the year");
					break;
		case FEB : System.out.println("This is wonderful month of the year");
					break;
		
		case MAR : System.out.println("This is budget month of the year");
					break;
		
		case APR : System.out.println("This is exam month of the year");
					break;
		
		case MAY : System.out.println("This is holiday month of the year");
					break;
		
		
		}
	}

}