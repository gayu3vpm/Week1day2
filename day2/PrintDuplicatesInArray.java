package week1.day2;
//Home Assignment
public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		int[] num1= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
	int size=num1.length;
		for(int i=0;i<size;i++)
		{
		for(int j=i+1;j<size;j++) {
		if(num1[i]==num1[j]) {			
		System.out.println("The PrintDuplicatesInArray is" + num1[i]);}
					}}
		
	}

}
