package week1.day2;

/*Java Problem (5/20)

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true*/
public class JavaChallenge5 {
	public static boolean containType(int[] num) {
		int size=num.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]==num[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
	
		int num[]= {1,2,3,1};
		boolean res=containType(num);//directly call static method no need to create object for class.
		System.out.println(res);
		
		

	}

}
