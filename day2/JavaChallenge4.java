package week1.day2;
public class JavaChallenge4 {
	public static int majorityElement(int[] num) {
		int size=num.length;
		int count;
		for(int i=0;i<size;i++) {
			count=1;
			for(int j=i+1;j<size;j++) {
				if(num[i]==num[j]) {
					count++;
				}
			}
			if(count>size/2) {
				return num[i];
			}
		}
		return -1;
	
	}

	public static void main(String[] args) {
		int num[]= {2,2,1,1,1,2,2};
		int res=majorityElement(num);//directly call static method no need to create object for class.
		System.out.println("Majority element :"+res);
		
	}
}
		