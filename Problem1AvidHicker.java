package hackerranksolutions;
import java.util.*;
public class Problem1AvidHicker
{

	public static void main(String[] args)
	{	
		String str = "DDUUUUDD";
		int n = str.length();
	    countValley(n,str);
		 }
			public static int countValley(int n, String str)
			{
				  int sum = 0;
				  int count = 0;
				  for(int i=0;i<n;i++)
				  {
				    if(str.charAt(i)=='U')
				    {
				      if(++sum==0)
				        count++;
				    }
				    else sum--;
				  }
				  System.out.println(count);
				  return count;
		    }
		
	}

