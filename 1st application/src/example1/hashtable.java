package example1;
import java.util.*; 
public class hashtable {
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1205,"nikhita");  
		  hm.put(1210,"ratnasri");  
		  hm.put(1215,"likhita");  
		  hm.put(1220,"devisri");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  	
}
