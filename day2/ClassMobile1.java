package week1.day2;



public class ClassMobile1 {

	public static void main(String[] args) {
		ClassMobile opp=new ClassMobile();//To create object for class should not use dot.
		opp.sendSms();
		long makeCall = opp.makeCall(98765456789l);//ctrl2 l -return value store.
		System.out.println(makeCall);//makeCall direct ah use
		
	
		

	}

}
