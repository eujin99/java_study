
public class StringDemoMain {
	
	public static void main(String[] arg) {
		// String :
		//자바에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수 타입
		//String 은 인스턴스 생성없이 사용가능하지만, 객체로 취급된다.
		String str01 = new String("eujin");
		String str02 = new String("eujin");
		//인스턴스 생성이 아니다. 인스턴스 생성은 new 연산자가 있어야 함.
		
		if (str01 == str02) {
			System.out.println("주소값이 동일합니다.");
			
		} else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		if (str01.equals(str02)) {
			System.out.println("값이 동일합니다.");
			
		}else {
			System.out.println("값이 동일하지 않습니다.");
		}
	}
}
