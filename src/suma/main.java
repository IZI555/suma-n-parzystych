package suma;

import java.util.Scanner;

public class main {
 public static void main(String args[]){
     Scanner in = new Scanner(System.in);
     System.out.println("podaj ile liczby chcialbys zsumowac");
    try
    {
    	int  n = in.nextInt();
        int s = 0;
        try
        {
       	 for(int  i = 0; n>i;i++)
   	     {
   	    	 System.out.println("podaj dowolne liczby");
   	    	 
   	    	 int x = in.nextInt();
   	    	 if(x%2==0)
   	    	 {
   	    		 s =s+x;   	 
   	    	 }
   	    	  else 
   	    	  {
   	 	    	 System.out.println("podana liczba nie jest parzysta");
   	    	  }
   	     }
            System.out.println("wynik wynosi"+s);
      
        }
        catch(Exception e)
        {
       	 System.out.println("Coœ posz³o nie tak. B³¹d : "+e);
        }

    
    
    }
    catch(Exception e)
    {
    	System.out.println("Cos poszlo nie tak "+e);
    }
     
     
     	     
     	

	           
	 
	 
	 
	 
	 
	 
	 
 }
}
