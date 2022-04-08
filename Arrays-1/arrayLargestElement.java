/*

Sample Input:
enter size of array
4
enter value for 0th index
249237
enter value for 1th index
432
enter value for 2th index
0
enter value for 3th index
-234

Sample Output:
249237

*/

import java.util.*;
class arrayLargestElement
{
	public static int findLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
        }
        return max;
    }
  public static int[] takeInput()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int arrSize=sc.nextInt();
	    int[] arr=new int[arrSize];
	    for(int i=0;i<arrSize;i++)
	    {
	         System.out.println("enter value for "+i+"th index");
	         arr[i]=sc.nextInt();
	    }
	    return arr;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	  int[] arr=takeInput();
      System.out.println( findLargest(arr));
      
	}
}
