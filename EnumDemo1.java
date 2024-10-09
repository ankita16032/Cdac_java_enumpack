package enumpack;
//-------------------->1st method
//enum Month
//{
//	JAN,FEB,MAR,APR,MAY;
//}

interface Interface1{
	String comp="OFS";
	void fun1();//abstract method
	void fun2();
}
enum Month implements Interface1{
	JAN,FEB,MAR,APR,MAY;
		public void fun1()
		{
			System.out.println("This is fun1");
		}
		public void fun2()
		{
			System.out.println("This is fun2");
		}
}

public class EnumDemo1 {
	//----------->2nd method
//	enum Month
//	{
//		JAN,FEB,MAR,APR,MAY;
//	}
	public static void main(String[] args) {
		
		Month m =Month.JAN;
		Month m1 =Month.FEB;
		Month m2=Month.MAR;
		Month m3=Month.APR;
		Month m4= Month.MAY;
		//datatype  variable;
		int a=100;
		m.fun1();
		m.fun2();
		//----------->3rd method
//		enum Month
//		{
//			JAN,FEB,MAR,APR,MAY;
//		}
		
		System.out.println(Month.JAN);
		System.out.println(Month.FEB);
		System.out.println(Month.MAR);
		System.out.println(Month.APR);
		System.out.println(Month.MAY);
		System.out.println("------------------------------");
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println("------------------------------");
		for(Month mm : Month.values() )
		{
			System.out.println(mm);
		}
		//Month month=new Month();--->can not be instantiated
	}
}
