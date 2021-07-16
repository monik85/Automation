
public class ParentClass {

	public int TotalMarks = 900;
	public String fname = "RahulDravid";
	
	
	public static void main(String[] args)
	{
     methods obj = new methods();
    int tot1 =  obj.Add(30 , 50 , 40);
    System.out.println(tot1);
    
    int tot2 =  obj.Add(30 , 50  );
    System.out.println(tot2);
    
    String Fullname = obj.Add("Rahul", "Dravid");
    System.out.println("RahulDravid");
	}
	
	public void TestNew()
	{
		System.out.println("This is Parent Class");
		
	}

	
	
	
     public void RateofInterest(int amount) 
     {
    	 int interest = 7;

       System.out.println("This is Parent CLass , Having Interest Rate is:"+interest);
     }
       public void Add()
       {
    	   
       }
       public void Sub()
       {
    	   
       }
       public void mul()
       {
    	   
       }
}

