package hackerranksolutions;

public class Absolute {
public static void main(String[] args) 
{
	int arr[][] = {  
			         {1, 2, 3}, 
                     {4 , 5, 6}, 
                     {9 , 8,  9} 
                 };
	int n = arr.length;
	int leftSum = 0, rightSum = 0;
	for (int i = 0; i < n; i++)
	{
		leftSum += arr[i][i]; // value of index should be same like arr[1][1] and arr[2][2]
		rightSum += arr[i][n - 1 - i];// value of index should be like arr[0][2] ,arr[1][1],arr[2][0]
	}
System.out.println((Math.abs(leftSum - rightSum)));
}
}


