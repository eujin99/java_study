package com.encore.test;

/*
 * 
 * XXXXVO.java 또는 XXXXDTO.java , XXXXEntity.java
 * -- 업무로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter , Getter 로 이루어짐
 *  
 * */

public class StudentVO {
	/*
	 * 변수(vasiable)
	 * 구문 형식 : 접근지정자 변수타입 변수명;
	 * 
	 * - 접근 지정자는 (public , private) 두 가지만 이해하자.
	 * - 변수 타입은 (기본타입 , 참조타입) 두 가지만 이해하자.
	 * - 변수명은 (소문자로 시작) 잊지말자.
	 * - 변수명은 선언 위치가 있는데 , 선언 위치에 따라 (전역, 지역)
	 * */
	

	// 전역변수 : 클래스 내에서 접근 가능한 범위를 갖는다. 국회의원 
	private String name ; //유일하게 참조타입이면서 기본타입처럼 사용 가능
	private int age;  //기본타입
	private double height ;  //기본타입
	private boolean isMarrage;  //기본타입
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarrage() {
		return isMarrage;
	}
	public void setMarrage(boolean isMarrage) {
		this.isMarrage = isMarrage;
	}
	
}


	

	/*
	 * 생성자 (Constructor)
	 * 매개변수가 없는 생성자는 기본 생성자
	 * 매개변수가 있는 생성자는 스페셜 생성자 
	 * 명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일 진행
	 * 
	 * 구문형식 : 접근지정자 클래스이름([매개변수]){
	 * 
	 * }
	 * 
	 * 클래스 안에는 변수 뿐만 아니라 메서드도 담을 수 있다.
	 * 
	 * 메서드(함수)
	 * 구문형식 : 접근지정자 반환타입 메서드이름([매개변수]){
	 *			문장;
	 *			return (기본값 또는 참조값);
	 *		  }
	 *
	 *만약 반환타입이 void가 아니라면 문장이 끝나기 전에
	 *return 키워드를 이용해서 값을 반환
	 *
	 *여기서 매개변수는 지역변수이다.
	 * */


