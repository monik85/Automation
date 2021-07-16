import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Collections {

	public static void main(String[] args)
	{
	/*	ArrayList<String> arr = new ArrayList<String>();
		
		ArrayList<Integer> arrh = new ArrayList<Integer>();
		HashMap<String , String> hashmap = new HashMap<String , String>();
		
		arr.add("Monika");
		arr.add("Praveen");
		arr.add("Jaanvika");
		arr.add("Advit");
		arr.add("Vivek");
		arr.add("Madhuri");		
		
		System.out.println(arr);
		
		//System.out.println(arr.get(4));

		//System.out.println("Before Set:"+arr.get(1));
		//arr.set(1, "Vansh");
		
		//System.out.println("After Set:"+arr.get(1));
		//System.out.println(arr);
		
		arr.remove(4);
		System.out.println(arr);
		arr.clear();
		System.out.println(arr.size());     */
		
	
	
	            // student name , total marks
	           // jhon          , 950
	          // David     , 700
	         // jerry , 500
	
	    
    HashMap<String , String> hashmap = new HashMap<String , String>();
    hashmap.put("jhon","850");
    hashmap.put("David","750");
    hashmap.put("Sam","650");
    hashmap.put("jhon","550");
    hashmap.put("jerry","450");
    
  // System.out.println(hashmap);
   
  // System.out.println(hashmap.get("jhon"));
   /* System.out.println(hashmap);
    hashmap.remove("jerry");
    System.out.println(hashmap);
    
    hashmap.clear(); */
    
    HashSet<String> Hash = new HashSet<String>();
    Hash.add("BMW");
    Hash.add("Ford");
    Hash.add("Volvo");
    Hash.add("Audi");
    Hash.add("Tata");
    Hash.add("BMW");
    
    System.out.println(Hash);
    
   boolean status = Hash.contains("Audi");
    
   //
   
   System.out.println(status);
   
   //Iterator
   
   Iterator<String> val = Hash.iterator();
   
   val.next();
   System.out.println(val.next());
   
   while(val.hasNext())
   {
	   System.out.println(val.next());
	   
   }
    
    
    
    
   
	}
}
    
   
    
    
    
    