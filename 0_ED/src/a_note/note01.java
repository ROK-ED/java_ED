package a_note;

import java.util.Scanner;

public class note01 {

	public static void main(String[] args) {
System.out.println("====================================================================================================");
//02 변수와 타입
//  02-01 변수 p.48
		// 변수선언
		// a와 b의 변수를 서로 바꾸는법
//  02-02 기본 타입 p.59
		// 정수
		//  byte,char,short,기본-int,long(L)
//
		int var020201 = 365; // 10진수 일반적으로 사용
		int var020202 = 0b1011; // 이진수 0b ->이진수라는걸 인지시키는문자
		int var020203 = 0206; // 8진수 0 ->8진수라는걸 인지시키는문자
		int var020204 = 0xB3; // 16진수 0x ->16진수라는걸 인지시키는문자
		System.out.println(var020201);
		System.out.println(var020202);
		System.out.println(var020203);
		System.out.println(var020204);
		//  String
		String str0202Java = "나는 \"자바\"를 좋아합니다.";
		System.out.println(str0202Java + "\"출력하는법 이스케이프 문자 \\ 중요");
//		//  그외 이스케이프 문자 p.66
		//   \t 탭만큼 띄움
		//   \n 줄바꿈
		//   \r 캐리지리턴
		// 실수
		//  float(F),기본-double
//		// 논리
		//  boolean
		boolean stop020201 = true;
		if (stop020201) {
			System.out.println("중지합니다");
		}

		boolean stop020202 = false;
		if (stop020202) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
//  02-03 타입 변환 p.72
		// 강제 타입변환 ~(타입)인수 로 강제 지정
		char charValue0203 = 'A'; //65; ~유니코드값
    	System.out.println("charValue1: "+charValue0203);
    	System.out.println("charValue1의 유니코드 값: "+(int)charValue0203);  //()로 강제로 숫자변환
    	// 연산에서의 자동 타입 변환 
    	//   같은 타입의 연산은 둘중 범위가 큰것으로 할것
    	//   연산할때 우선도가 높은(괄호안, 사칙연산, 왼쪽)식의 타입으로 자동변환
//  02-04 변수와 시스템 입출력 p.89
    	// 모니터로 변수값 출력하기
    	//  println(내용); ~>내용 출력하고 행을 바꿈
    	System.out.println("Hello World!");
    	//  print(내용); ~>내용 출력
    	System.out.print("Hello World!\n");    // \n : 줄바꿈 ~ 이스케이프문자 중하나 
    	//  printf("형식문자열",값1,값2,..);
    	int x0204 = 1;
		int y0204 = 2;
    	System.out.printf("x0204: %d, y0204: %d\n",x0204,y0204);     // %d변수값 순서대로 입력된다
//    	// 형식 문자열 p.91
    	//  정수               ex)123
    	//   %d                  123
    	//   %6d                 ()()()123
    	//   %-5d                123()()
    	//   %07d                0000123
    	//  실수               ex)123.987
    	//   %.2f                123.99
    	//   %10.2               ()()()()123.99
    	//   %-10.3              123.987()()()
    	//   %010.3              000123.987
    	//  문자열              ex)abc
    	//   %s                  abc
        //   %6s                 ()()()abc
    	//   %-7s                abc()()()()
    	//  특수문자
    	//   \t                  탭(tap)
    	//   \n                  줄바꿈
    	//   %%                  %
//    	// 키보드에서 입력된 내용을 변수에 저장하기
        //  키코드
//      int keyCode;
//		keyCode = System.in.read();
//		System.out.println(keyCode);
    	//스캐너
//		Scanner scanner = new Scanner(System.in);     // 컨트롤 쉬프트 o 로 import 선언
//		String inputData = scanner.nextLine();
//		System.out.println(inputData);
System.out.println("====================================================================================================");
//03 연산자
//  03-01 연산자와 연산식 p.102
    	// 연산자의 종류
    	//  연산자 종류    연산자                                 피연산자 수      산출값       기능
    	//  산술   p.114  +, -, *, /, %                        이항            숫자        사칙연산 및 나머지계산
    	//  부호   p.109  +, -                                 단항            숫자        음수와 양수의 부호
    	//  문자열  p.118  +                                    이항           문자열       두 문자열을 연결
        //  대입   p.123  =, +=, -=, *=, /=, %=, &=, |=, ^=    이항            다양        우변의 값을 좌변의 변수에 대입
    	//  증감   p.110  ++, --                               단항            숫자        1만큼 증가, 감소
    	//  비교   p.119  ==, !=, >, <, >=, <=, instanceof     이항            boolean    값의 비교
    	//  논리   p.113  !                                    단항            boolean    논리 부정
    	//  논리   p.121  &, |, &&, ||, ^, !                   이항            boolean    논리곱, 논리합, 배타적 논리합, 논리 부정
    	//  조건식  p.125  (조건식)? A : B                       삼항            다양        조건식에 따라 A 또는 B중 하나를 선택
    	// 연산의 방향과 우선순위
    	//  1. 단항, 이항, 삼항 연산자 순으로 우선순위 가짐.(피연산자 순)
    	//  2. 산술, 비교, 논리, 대입 연산자 순으로 우선순위
    	//  3. 단항, 부호, 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽 (증감, 대입은 오른쪽에서, 왼쪽)
    	//  4. 복잡한 연산식에는 괄호()로 우선순위 정할것
//  03-02 연산자의 종류 p.108
    	// 단항, 이항, 삼항
System.out.println("====================================================================================================");
//04 조건문과 반복문
//  04-01 조건문: if문, switch문 p.134
    	// if문
    	//  기본 IF문  ~ 조건에 부합하는 여러 IF 전부 실행
		int score0401 = 90;

		if (score0401 >= 90) {
			System.out.println("점수가 90보다 큼니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score0401 <= 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

		//  IF~ELSE 문 ~조건에 부합하는 IF 또는 ELSE실행
		if (score0401 >= 90) {
			System.out.println("점수가 90보다 큼니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
        //  IF ~ ELSE IF ~ ELSE 구문           //ELSE 는 필수X, 필요에따라
		score0401 = 75;
				
		if (score0401 >= 90) {
			System.out.println("점수가 100~90입니다..");
			System.out.println("등급은 A입니다.");
		} else if (score0401 >= 80) {
			System.out.println("점수가 89~80니다.");
			System.out.println("등급은 B입니다.");
		} else if (score0401 >= 70) {
			System.out.println("점수가 79~70니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만니다.");
			System.out.println("등급은 D입니다.");
		}

//		// 주사위 굴리기
		int dice0402 = (int) (Math.random()*6)+1;    
//      // 랜덤하게 6개의 정수가 주어진다
//      // 0.0 <= Math.ramdom() < 1.0 사이의 값이 주어진다.
//      // 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//      // (int) 0 <= (int) Math.random() * 10 < (int) 10
//      // (int) 0 + 1 <= (int) Math.random() * 10 + 1 < (int) 10 + 1
//      // (int)Math.random() * 갯수 + 시작숫자;
		if(dice0402 == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(dice0402 == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(dice0402 == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(dice0402 == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(dice0402 == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if(dice0402 == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		//switch ~if else보다 가독성이 뛰어남
		
		switch(dice0402) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;     //특별한 경우가 아닌이상 꼭 필요, 없다면 다음 케이스도 필요없이 실행함
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:   //case 외, 생략가능
			System.out.println("6번이 나왔습니다.");
			break;  //default에는 break 필요없음 ~어차피 마지막까지 가서 실행되는 문구라 멈출 필요없음 
		}
		//break 응용
		//누적출력
		int time0402 =(int)(Math.random()*4) + 8;
		System.out.println("현재시각 : " +time0402+"시");
		
		switch(time0402) {
		case 8 :
			System.out.println("출근합니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		} 
		
		//다중 조건
		char grade0402 = 'B';
		
		switch(grade0402) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");	
		} 


	}

}
