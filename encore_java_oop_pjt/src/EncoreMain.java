

public class EncoreMain {

	// byte => short => int => long => float => double (묵시적 형변환)
	//         char  =>
	
	//byte <= short <= int <= long <= float <= double 
	
	
	public static void main(String[] args) {
		System.out.println("eujin java");
		
		
		//지역변수 : 메서드 내에 선언하는 변수 시,도 의원
		long intValue = 10;
		char charValue = 'F'; //char 는 "문자열" , '문자' 구분한다.
		float doubleValue = 3.14F; //double 은 실수의 기본형!
		String stringValue = "유진님";
		boolean booleanValue = false;
		
		System.out.println("정수값: " + intValue);
		System.out.println("문자값: " + charValue);
		System.out.println("실수값: " + doubleValue);
		System.out.println("문자열값: " + stringValue);
		System.out.println("논리값: " + booleanValue);
	}
}


