package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		int size=num.length;//To get length of an array.
		System.out.println("The length of an array is "+size);
		 Arrays.sort(num);//2,3,4,6,7,11-ascending order
		System.out.println("The second largest element in an array is"+ num[size-2]);
	}

}
