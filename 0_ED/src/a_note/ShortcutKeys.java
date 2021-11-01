package a_note;

public class ShortcutKeys {

	public static void main(String[] args) {
		System.out.println("System.out.println -> syso + Ctrl + Shift + Enter 자동완성");
		System.out.println("f11 -> 자동실행");
		System.out.println("Ctrl + Shift + F -> 자동 줄 맞춤");
        System.out.println("\"출력하는법 이스케이프 문자 \\" );
        System.out.println("Ctrl + F - 찾기 바꾸기 가능");

        //스캐너
//		Scanner scanner = new Scanner(System.in);     // 컨트롤 쉬프트 o 로 import 선언
//		String a = scanner.nextLine();
//      int a = scanner.nextInt();
//		System.out.println(a);

        //(int)Math.random() * 갯수 + 시작숫자;
        int dice = (int) (Math.random()*6)+1;    
//      // 랜덤하게 6개의 정수가 주어진다
//      // 0.0 <= Math.ramdom() < 1.0 사이의 값이 주어진다.
//      // 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//      // (int) 0 <= (int) Math.random() * 10 < (int) 10
//      // (int) 0 + 1 <= (int) Math.random() * 10 + 1 < (int) 10 + 1
        System.exit(0);       //시스템 강제종료
        
//      this.  ~인스턴스의 메모리 
        
     // System.arraycopy();  ~배열 복사 시스템 언어
     		String[] oldStrArray = {"java","array","copy"};
     		String[] newStrArray = new String[5];
     		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
     		
     		for(int i=0; i<newStrArray.length; i++) {
     			System.out.println(newStrArray[i]);
     		}
     		
     		
     		//향상된 for문
     		int[] scoresList = {95,71,84,93,87};
     		
     		
     		int sum = 0;
     		for(int score : scoresList) {
     			System.out.println(score);
     			sum += score;
     		}
     		System.out.println("총합: "+sum);
     		
     		double avg = (double) sum/ scoresList.length;
     		System.out.println("평균: "+avg);

      
	}

}
