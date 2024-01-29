package com.encore.car.engine;

public class Engine {
	
	private String engineType ;
	
	//생성자 오버로딩, 메서드 오버로딩 :
	//생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재정의 가능.
	//오버로딩을 통해서 많은 인자를 받을 수 있다.
	//생성자는 매개변수로 받은 값을 전역(멤버)변수에 할당하는 역할을 함.
	
	//전역변수
	public Engine() {
	}
	
	//지역변수
	public Engine(String engineType) {
		this.engineType = engineType ;
		//선언 위치가 다르면 변수명을 여러번 사용하는 것이 가능.
		//하지만 모호성 발생
		//지역변수와 전역변수 이름이 같으면 지역변수가 우선권을 가짐.
	}
	
	public String showInfo() {
		return "엔진의 타입은"+engineType+"입니다." ;
	}

}
