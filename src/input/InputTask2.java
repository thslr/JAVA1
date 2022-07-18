package input;

import java.util.Scanner;

public class InputTask2 {
public static void main(String[] args) {
//	3개의 정수를 한번에 입력 받은 후  
//	3개의 정수의 곱 출력
	Scanner sc = new Scanner(System.in);
	int integer1 = 0;
	int integer2 = 0;
	int integer3 = 0;
	
	System.out.println("3개의 정수를 입력해주세요.");
	System.out.println("Teb를 누르시고 다음 정수를 입력하세요");
	System.out.print("정수1 : ");
	integer1 =  Integer.parseInt(sc.next());
	System.out.print("정수2 : ");
	integer2 =  Integer.parseInt(sc.next());
	System.out.print("정수3 : ");
	integer3 =  Integer.parseInt(sc.next());
	
	System.out.printf("세 정수의 곱 : %d",integer1*integer2*integer3);

// 입력 3 출력 1
}
}
