package vsTest01;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
        
        System.out.println("인덱스 입력[1]");
        int index1 = sc.nextInt();
        System.out.println("인덱스 입력[2]");
        int index2 = sc.nextInt();
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for(int temporary : arr){
            System.out.print(temporary + " ");
        }
        System.out.println();

		// 문제 2) 값 2개를 입력받아 값 교체하기
        
        System.out.println("인덱스 입력[1]");
        int value1 = sc.nextInt();
        System.out.println("인덱스 입력[2]");
        int value2 = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(value1 == arr[i]) index1 = i;
            if(value2 == arr[i]) index2 = i;
        }
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for(int temporary : arr){
            System.out.print(temporary + " ");
        }
        System.out.println();

		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
        // 문제 3) 학번 2개를 입력받아 성적 교체하기
        
        System.out.println("학번을 입력 [1]");
        value1 = sc.nextInt();
        System.out.println("학번을 입력 [2]");
        value2 = sc.nextInt();

        for(int i = 0; i < hakbuns.length; i++){
            if(value1 == hakbuns[i]) index1 = i;
            if(value2 == hakbuns[i]) index2 = i;
        }
        temp = scores[index1];
        scores[index1] = scores[index2];
        scores[index2] = temp;

        for(int temporary : scores){
            System.out.print(temporary + " ");
        }
        System.out.println();

        sc.close();
    }
}