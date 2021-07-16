
public class ExceptionHandlingExamples {

	public static void main(String[] args) 
	{
		 String[]names = {"Advit","Jaanvi","Monika","Praveen","Vivek","Madhuri"};
	       
	       int size = names.length;
	       
	       try {
	    	   
	       for(int i = 0; i<7; i++)
	       {
	    	   System.out.println(names[i]);
	       }
	       }
	       catch(Exception e)
	       {
	    	   System.out.println(e);
	       }
	       finally
	       {
	    	   System.out.println("There is finally Block");
	       }
	    	   
	       
	       {
	        System.out.println("There is no Exception");
	       }
	}

}
