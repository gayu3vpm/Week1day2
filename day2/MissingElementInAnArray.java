package week1.day2;

import java.util.Arrays;

//Home Assignment
public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,8};
		int missed=0;//local variable must be initialized
		int temp;
		Arrays.sort(arr);//sort array in ascending order
		for(int i=0;i<arr.length;i++)
		{
			temp=i+1;
			if(arr[i]!=temp) {
				missed=temp;
				break;
				
			}
		}
		System.out.println("The missing elements is" + missed);
		
	} 

}
