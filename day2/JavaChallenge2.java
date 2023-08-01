package week1.day2;

/*Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1*/
//need to discuss
public class JavaChallenge2 {

	public static void main(String[] args) {
		int[] arr= {2,2,1};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++) {
				
				if(arr[i]!=arr[j]) {
					System.out.println("The Single Element is" +arr[i]);
					
				}
					
			}
		}

	}

}
