
public class conditionalStatement {

	public static void main(String[] args)
	{
	 /*int StudentMarks = 220;    
	/* >900 1st
     <900 >700 2nd   AND
	  <700 >500 3rd */
	 
/*	 if(StudentMarks >= 900) //true //StudentMarks >= 900---false
	 {
		 System.out.println("student got 1st class:"+StudentMarks);
	}
	 else if(StudentMarks < 900   && StudentMarks >=700)
	 {
		 System.out.println("student got 2st class:"+StudentMarks);
	 }
	 else if(StudentMarks < 700   && StudentMarks >=500)
	 {
		 System.out.println("student got 3rd class:"+StudentMarks);
	 }
	 else
	 {
		 System.out.println("student got failed:"+StudentMarks);
	 }*/
		
		
     /*  int dayy = 1;
		
		if(dayy == 1)
			
		{
		   System.out.println("Monday");
		}
		else if(dayy == 2)
			
		{
		   System.out.println("Tuesday");
		}
		else if(dayy == 3)
			
		{
		   System.out.println("Wednesday");
		}
		else if(dayy == 4)
			
		{
		   System.out.println("Thursday");
		}
		else if(dayy == 5)
			
		{
		   System.out.println("Friday");
		}
		else if(dayy == 6)
			
		{
		   System.out.println("Saturaday");
		}
		else if(dayy == 7)
			
		{
		   System.out.println("Sunday");
		}*/
		
		String firstname = "Rahul";
		String secondname = "rahul";
		
	if(firstname.equalsIgnoreCase(secondname))
	{
		
	}
     
      //  1,2,3,4,5; "classA"
        
       // 6,7,8,9,10; "classB"
        
        int no =5;
        switch(no)
        {

        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
              System.out.println("classA");
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
              System.out.println("classB");
              break;
        }
 
        
	 
	///SWITCH-----
/*	 int day = 12; /// int yyyy = 1990,2020
	 switch(day)
	 {
	 case 1:
		 System.out.println("Monday");
		break;
	 case 2:
		 System.out.println("Tuesday");
		break;
	 case 3:
		 System.out.println("Wednesday");
		break;
	 case 4:
		 System.out.println("Thursday");
		break;
	 case 5:
		 System.out.println("Friday");
		break;
	 case 6:
		 System.out.println("Saturday");
		break;
	 case 7:
		 System.out.println("Sunday");
		break;
		default:
		System.out.println("it is not a vaild day"); 
		
			
	 }*/
	 int StudentMarks  = 700;
	switch(StudentMarks)
	{
	
	case 900:
		 System.out.println("StudentMarks=900");
		 
		break;
	case 820:
		 System.out.println("StudentMarks=820");
		break;
	case 700:
		 System.out.println("StudentMarks=700");
		break;
	case 500:
		 System.out.println("StudentMarks=500");
		break;
		default:
		 System.out.println("240");  
		 
	}
		
	 
	}
	

}
