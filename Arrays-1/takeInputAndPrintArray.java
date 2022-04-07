/*

Sample Input:
5
2
4
5
2
6

Sample Output:
set size of array
set value of index 0
set value of index 1
set value of index 2
set value of index 3
set value of index 4
printing the array
| 2 | 4 | 5 | 2 | 6 | 

*/

import java.util.*;
class takeInputAndPrintArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("set size of array");
      int arrSize=sc.nextInt();
      int arr[]=new int[arrSize];
      for(int i=0;i<arrSize;i++)
      {   
          System.out.println("set value of index "+i);
          arr[i]=sc.nextInt();
      }
      
      System.out.println("printing the array");
      System.out.print("| ");
      for(int i=0;i<arrSize;i++)
      {   
          System.out.print(arr[i]+" | ");
      }
	}
}
