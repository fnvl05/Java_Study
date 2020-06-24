package CodeUp.test01;

import java.util.Scanner;

public class test02 {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // 1017 정수 1개를 입력받아 3번 출력하기
        System.out.println("정수 입력");
        int num1017 = sc.nextInt();
        System.out.printf("%d %d %d \n", num1017, num1017, num1017);
       
        // 1018 시간 입력받아 그대로 출력
        System.out.println("시간을 입력하세요");
        int tiem = sc.nextInt();
        System.out.println("분을 입력하세요");
        int minute = sc.nextInt();
        System.out.printf("%d : %d \n", tiem, minute);
       
        // 1019 연월일 입력받아 그대로 출력
        System.out.println("연,월,일 로 입력하세요");
        String date = sc.next();
        int check = 0;
        for(int i = 0; i < date.length(); i++){
            if(date.charAt(i) == ','){
                check += 1;
            }
        }
        String [] resultValue = date.split(",");
        if(check == 2){
            System.out.printf("%04d.%02d.%02d\n",Integer.parseInt(resultValue[0]), Integer.parseInt(resultValue[1]), Integer.parseInt(resultValue[2]));
        }else {
            System.out.println("년(value).월(value).일(value) 로 입력해주세요");
        }
       
        // 1020 주민번호를 입력받아 형태를 바꿔 출력
        System.out.println("주민번호 XXXXXX-XXXXXXX 로 입력");
        String number = sc.next();
        boolean isTrue = false;
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == '-'){
                isTrue = true;
            }
        }
        if(isTrue){
            String [] resultString1 = number.split("-");
            System.out.printf("%s%s \n", resultString1[0], resultString1[1]);
        }else {
            System.out.println("잘못 입력하였습니다.");
        }
        sc.close();
    }
}