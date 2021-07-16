
public class ChildCLass extends ParentClass {
	
	void test() 
	{
		
	}

	public static void main(String[] args) 
	{
		yesBank bo = new yesBank();
		bo.credit();
		bo.Debit();
		bo.FD();
		bo.Loans();
		
		
     /* ChildCLass obj = new ChildCLass();
      obj.RateofInterest(1000);
      
      ParentClass obj2 = new ParentClass();
      obj2.RateofInterest(2000);
      
      ParentClass obj3 = new ChildCLass();
      obj3.RateofInterest(4000);*/
	}
	public void RateofInterest(int amount) 
    {
   	 int interest = 8;
 	
   
           System.out.println("This is Child CLass , Having Interest Rate is:"+interest);
     }
   	 
   
   	 public void TestName()
   	 {
   		 System.out.println("This is Child Class");
   		 
   	 }
   	
}
