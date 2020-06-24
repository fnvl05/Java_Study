package CodeUp.test01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //1001 Hello출력
        System.out.println("Hello");
        //1002 Hello World 출력
        System.out.println("Hello World");
        //1003 Hello 엔터 World 출력
        System.out.println("Hello\nWorld");
        //1004 'Hello' 출력
        System.out.println("\'Hello\'");
        //1005 "Hello World" 출력
        System.out.println("\"Hello World\"");
        //1006 !@#$%^&*() 출력
        System.out.println("!@#$%^&*()");
        //1007 "C:\Download\hello.cpp" 출력
        System.out.println("\"C:\\Download\\hello.cpp\"");
        //1008 유니코드 출력
        System.out.println("\u256D\u252C\u256E\n\u2502\u253C\u2502\n\u2570\u2534\u256f");
        //1010 정수 1개 입력받아 그대로 출력하기
        System.out.println("정수 입력하기");
        Scanner sc = new Scanner(System.in);
        int number1010 = sc.nextInt();
        System.out.println("정수 : " + number1010);
        //1011 문자 1개를 입력받아 그대로 출력
        System.out.println("문자 1개를 입력");
        String char1011 = sc.next();
        char resultChar = char1011.charAt(0);
        System.out.println(resultChar);
        //1012 실수 1개를 입력받아 그대로 출력
        System.out.println("실수 입력");
        float float1012 = sc.nextFloat();
        System.out.println(float1012);
        //1013 정수 2개를 입력받아 그대로 출력
        System.out.println("[1]정수 입력");
        int num1013_1 = sc.nextInt();
        System.out.println("[2]정수 입력");
        int num1013_2 = sc.nextInt();
        System.out.printf("%d %d \n",num1013_1 ,num1013_2);
        //1014 문자 2개 입력받아 순서 바꿔 출력
        System.out.println("문자 2개를 입력");
        String str1014 = sc.next();
        char char1014_1 = str1014.charAt(0);
        char char1014_2 = str1014.charAt(1);
        System.out.println(char1014_2 + " " + char1014_1);
        //1015 실수 입력받아 둘째 자리까지 출력하기
        System.out.println("실수 입력");
        float float1015 = sc.nextFloat();
        System.out.printf("%.2f \n", float1015);

        sc.close();
    }
}