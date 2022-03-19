package week3;

 

import java.util.Scanner;

 

public class Basic3 {

 

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		

		String name;

		System.out.printf("이름 입력: ");

		name = scn.next();

		if(name.equals("홍길동")) //주소 비교 문자열은 equals

			System.out.printf("이름이 %s 입니다 \n",name);

		else

			System.out.printf("%s이 아닙니다\n",name);

		scn.close();

	}

 

}