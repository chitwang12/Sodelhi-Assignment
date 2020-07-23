package hackerranksolutions;
import java .util.*;
public class AbsoluteDifference {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	int n = sc.nextInt();
	int m = sc.nextInt();
	int arr[][] = new int[n][m];   
	
	while(t>0)   // for number of test cases
	{
		for(int i=0;i<arr.length;i++)       // taking input from the user
		{
			for(int j =0;j<arr.length;j++)
			{
				arr[i][j] = sc.nextInt();
		    }
	    }
		
		absoluteDifference(arr,n);
		
	}
	sc.close();
}

public static int absoluteDifference(int arr[][],int n)
{
	int leftSum = 0, rightSum = 0;
	for (int i = 0; i < n; i++)
	{
		leftSum += arr[i][i]; // value of index should be same like arr[1][1] and arr[2][2]
		rightSum += arr[i][n - 1 - i];// value of index should be like arr[0][2] ,arr[1][1],arr[2][0]
	}
	return (Math.abs(leftSum - rightSum));
}

}
