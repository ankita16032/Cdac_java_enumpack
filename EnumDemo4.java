package enumpack;
enum Days
{
	SUN,MON,TUE,WED,THU,FRI,SAT;
}
public class EnumDemo4 {

	public static void main(String[] args) {
		for(Days dd : Days.values() )
		{
			System.out.println(dd);
		}
		System.out.println("----------------------------------");
		Days d = Days.TUE;
		System.out.println(d);
		
		switch(d)
		{
		case SUN: System.out.println("Sunday");
					break;
		case MON: System.out.println("Monday");
		break;
		
		case TUE: System.out.println("Tuesday");
		break;
		
		case WED: System.out.println("Wednesday");
		break;
		
		case THU: System.out.println("Thursday");
		break;
		
		case FRI: System.out.println("Friday");
		break;
		
		case SAT: System.out.println("saturday");
		break;
		}
		
		
	}

}
