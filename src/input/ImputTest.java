package input;

import java.util.Scanner;

public class ImputTest {
public static void main(String[] args) {
//	초기값
//	정수 : 0
//	실수 : 0.0
//	문자 : ' '
//	문자열 : null 또는 ""
	
	Scanner sc = new Scanner(System.in);
	String name = null;
	
	System.out.print("이름 : ");
	name = sc.nextLine();
//	name = sc.next();
	System.out.println(name + "님 환영합니다.");
}
}
