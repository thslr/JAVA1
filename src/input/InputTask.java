package input;

import java.util.Scanner;

public class InputTask {
public static void main(String[] args) {
//	두 정수를 입력 한 뒤 덧셈결과 출력
//	단, next()만 사용
	
	Scanner sc = new Scanner(System.in);
	
	int ger1 = 0;
	int ger2 = 0;
	
	System.out.println("두 정수를 입력해주세요");
	System.out.print("정수 1 : ");
	ger1= Integer.parseInt(sc.next());
	System.out.print("정수 2 : ");
	ger2= Integer.parseInt(sc.next());
	  System.out.printf("두 정수의 합 : %d",ger1+ger2);
	 
	
}
}

