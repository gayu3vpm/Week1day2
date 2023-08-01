package week1.day2;
/*Java Challenge (3/20)

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false*/
//happy number

public class JavaChallenge3 {

	public static void main(String[] args) {
		int n=19;
		while(n>=10) {
			int sum=0,rem=0;
			while(n>0) {
				rem=n%10;
				sum=sum+(rem*rem);
				n=n/10;
			}
			n=sum;
		}
       if(n==1) {
    	  System.out.println("Happy Number");
       }
       else
       {
    	   System.out.println(" Not Happy Number");
       }
	}

}
