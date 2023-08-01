package week1.day2;

import java.util.Arrays;

public class LearnArrary {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		Arrays.sort(num);//2,2,3,5,5,7,7-asc order
		for(int i=0;i<num.length-1;i++) //next line num[i+1] so we use length -1
		{
			if(num[i]==num[i+1])
			{
			System.out.println(num[i]);	
			}
		}
			

	}

}
