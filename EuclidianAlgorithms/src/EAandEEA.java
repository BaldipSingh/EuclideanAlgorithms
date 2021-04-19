
public class EAandEEA {

	
	public static int EA(int a, int b)
    {
        if (a == 0)
            return b;
         
        return EA(b%a, a);
    } // end of EA
	
	
	public static int EEA(int a, int b, int x, int y) {
		
		//ax + by = gcd(a, b) 
		
		if(a == 0)
		{
			x=0;
			y=1;
			return b;	
		} //end of if
		
		int c1=1,d1=1;
		int gcd = EEA(b%a,a,c1,d1);
		
		x = d1 - (b/a)* c1;
		y=c1;
		
		return gcd;

	}//end of EEA
	

	static void Inversing(int a, int m)
	{
	    int g = EA(a, m);
	    if (g != 1)
	        System.out.println("Inverse of " + a + " (mod " + m + ") doesn't exist");
	    else
	    {
	       
	        System.out.println(
	            "Inverse is "
	            + inverse(a, m - 2, m));
	    }//end of if
	}//end of Inversing

	  static int inverse(int x, int y, int m)
	{
	    if (y == 0)
	        return 1;
	    int p = inverse(x, y / 2, m) % m;
	    p = (int)((p * (long)p) % m);
	    if (y % 2 == 0)
	        return p;
	    else
	        return (int)((x * (long)p) % m);
	}
	  
	  
	  
	public static void main(String args[]) {
		
		//EA
		 
		int a = 400, b = 20;//Two Parameters Entered
		  int a1 = 35, b1 = 5;
		  int a2 = 100020023, b2 = 153533;
		  int gcd = EA(a, b);
	       int gcd2 = EA(a1, b1);
	       int gcd3 = EA(a2, b2);
	     
	       
	        System.out.println("EA: \nGCD(" + a +  " , " + b+ ") = " + gcd);
	        System.out.println("\nGCD(" + a1 +  " , " + b1+ ") = " + gcd2);
	        System.out.println("\nGCD(" + a2 +  " , " + b2+ ") = " + gcd3);
	    
	       
		//EAA
		int x=1, y=1;					
		int gcd1 = EEA(a,b,x,y);
		int gcd4 = EEA(a1,b1,x,y);
		int gcd5 = EEA(a2,b2,x,y);
		System.out.println("EEA: \nGCD(" + a +  " , " + b+ ") = " + gcd1);
		int m = b;
		int m1 = b2;
		int m2 = b2;
		Inversing(a, m);
		System.out.println(" \nGCD(" + a1 +  " , " + b1+ ") = " + gcd1);
	
		Inversing(a1, m1);
		System.out.println(" \nGCD(" + a2 +  " , " + b2+ ") = " + gcd1);
		
		Inversing(a2, m2);
		
	}//end of main
	
	
	
} //end of class
