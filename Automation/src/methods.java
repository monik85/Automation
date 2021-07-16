
public class methods {

	public static void main(String[] args)
	{
		Learning obj11 = new Learning ();
		
		
		ParentClass obj1 = new ParentClass();
		obj1.TestNew();
		
		ChildCLass obj2 = new ChildCLass();
		obj2.TestNew();
		
		
		
		//Constructors obj = new Constructors();
		//obj.Logfile();
		//Login obj = new Login();
		//int value = Add(1450,999);
		//System.out.println(value);
		//String Name = fullName("Ragul","Dravid");
		//System.out.println(Name);
		//sub();
      	}
 
	public static int Add(int a , int b , int c)
	 {
		
		
		int total = a + b + c ;
		//System.out.println("Addition:"+total);
		
		 
		
		 return total;
	 }
		public static int Add(int a , int b) 
		{		 
		
			 int total = a  + b ;
		 
			 return total;
		// System.out.println("Substraction:"+total);
			 	 
	 }
		public static String Add(String Fname , String Lname) 
		{		 
		
			String FullName = Fname + Lname;
		 
			 return FullName;
		}
			 
		
		public static String fullName(String Fname , String Lname) {
			String Name = Fname+Lname;
			return Name;
		}
}

