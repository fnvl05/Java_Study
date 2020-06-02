package vsTest01;

import java.util.Random;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        int [] arr = new int [5];
        int [] check = new int [5];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++){
            int ran = random.nextInt(arr.length);
            if(check[ran] == 0){
                arr[i] = ran;
                check[ran] = 1;
            }else i -= 1;
        }
        int n = 0;
        while(n < arr.length){
            for(int temp : arr){
                System.out.print(temp + " ");
            }
            System.out.println("\n인덱스를 입력하세요");
            int index = sc.nextInt();      
            if(arr[index] == n){
                arr[index] = 9;
                n += 1;
            }else if(arr[index] == 9)System.out.println("입력할수 없습니다.");
        }
        sc.close();
    }
}