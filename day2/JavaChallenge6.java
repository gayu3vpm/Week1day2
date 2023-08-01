package week1.day2;

/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false*/
public class JavaChallenge6 {
	 public boolean duplicate(int num[]) {
		 int size=num.length;
		 int k=2;
		 for(int i=0;i<size;i++) {
			 for(int j=i+1;j<size;j++) {
				 if(num[i]==num[j]) {
					 if(Math.abs(i-j)<=k) {
						 return true;
					 }
				 }
			 }
		 }
		 return false;
	 }
	 public static void main(String[] args) {
		 int num[]= {1,2,3,1,2,3};
		 JavaChallenge6 jv6=new JavaChallenge6();//create obj for class
		 boolean res=jv6.duplicate(num);//assign obj to call method(non- static method)
		 System.out.println(res);

	}

}
