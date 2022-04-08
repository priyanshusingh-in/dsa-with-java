/*

Sample Input:
enter size of array
5
enter value for 0th index
2
enter value for 1th index
4
enter value for 2th index
5
enter value for 3th index
2
enter value for 4th index
6

Sample Output:
19

*/

public class arrayElementSum{

	public static int sum(int[] arr) {
       int result=0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
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
	public static void main(String[] args) {
		
		int[] arr=takeInput();
    System.out.println( sum(arr));
		
	}

}
