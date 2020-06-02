package vsTest01;

import java.util.Scanner;

public class test18 {
    //# 배열 컨트롤러[1단계] : 추가

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int count = 5;
        
        Scanner sc = new Scanner(System.in);
        // 배열 추가
        System.out.println("입력하세요");
        int text = sc.nextInt();

        int [] temp = new int [count];
        for(int i = 0; i < count; i++){
            temp[i] = arr[i];
        }
        count += 1;

        arr = new int [count];

        for(int i = 0; i < count - 1; i++){
            arr[i] = temp[i];
        }
        arr[count - 1] = text;
        temp = new int [count];
        for(int i = 0; i < count; i++){
            temp[i] = arr[i];
        } 

        for(int i = 0 ; i < count; i++){
            System.out.print(arr[i] + " ");
        }
        // 완전 삭제
        System.out.println("\n삭제할 인덱스 입력");
        int index = sc.nextInt();
        for(int i = index; i < count - 1; i++){
            temp[i] = arr[i + 1];
        }
        count -= 1;
        arr = new int [count];
        for(int i = 0; i < count; i++){
            arr[i] = temp[i];
        }
        for(int i = 0; i < count; i++){
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
    
}