package vsTest01;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45  , 1003:54
		
		// 문제1) 학번을 입력하면 점수 출력 
		// 문제2) 점수를 입력하면 학번 출력 

        Scanner sc = new Scanner(System.in);
        int index = -1;

        System.out.println("학번을 입력");
        int hak = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(hak == arr[i]){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.printf("점수 : %d %n", arr[index + 1]);
        }else {
            System.out.println("잘못된 입력입니다.");
        }
        
        System.out.println("점수를 입력");
        int score = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(score == arr[i]){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.printf("점수 : %d %n", arr[index - 1]);
        }else {
            System.out.println("잘못된 입력입니다.");
        }

        int scores[] = {1001, 20,43 , 1002 , 54,2 , 1003,76,6};
		
		// 학번과 국어 수학 점수이다 
		// 예) 1001 == (20 , 43)
		//    1002 == (54 , 2)
		//    1003 == (76 , 6)
		// 문제3)  점수의 합을 입력하면 번호 출력 
		// 예)  63 ==> 1001 
		// 예)  56 ==> 1002
        // 예)  82 ==> 1003
        
        index = -1;
        int total = 0;

        System.out.println("2 학번을 입력");
        int hakbuns = sc.nextInt();
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == hakbuns){
                index = i;
                break;
            }
        }
        total = scores[index + 1] + scores[index + 2];
        if(index != -1){
            System.out.println("점수 합산 점수: " + total);
        }

        index = -1;
        System.out.println("2 점수 입력");
        score = sc.nextInt();
        for(int i = 0; i < scores.length; i++){
            total = scores[i + 1] + scores[i + 2];
            if(score == total){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("학번 : " + scores[index]);
        }else{
            System.out.println("잘못된 입력입니다.");
        }
        sc.close();
    }
}