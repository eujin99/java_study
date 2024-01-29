
public class CastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x,y,sum; //선언
		x = 10;
		y = 10;
		sum = (byte)(x+y);
		System.out.println("sum= " +sum);
		System.out.println();
		System.out.println();
		
		char charValue = 'A';
		char charValue02 = 'B';
		System.out.println("char value = " +charValue);
		
		//문자열끼리 더할 수 없으니 자동으로 묵시적 형변환 65 + 66 을 해버림
		System.out.println( charValue + charValue02 );
		
		//묵시적 형변환이 싫어서 casting 시킨 예.
		System.out.println( (char)(97));

	}

}