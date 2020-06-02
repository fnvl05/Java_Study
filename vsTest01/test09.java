package vsTest01;

import java.util.Scanner;

public class test09 {
    /*
    * # 즉석복권
    * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
    * 2. 아래 3종류의 복권의 당첨여부를 출력한다.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = {0, 0, 7, 7, 7, 0, 0, 7, 0};
        int [] arr2 = {0, 0, 7, 0, 7, 0, 0, 7, 0};
        int [] arr3 = {0, 0, 0, 7, 7, 7, 0, 7, 7};

        while(true){
           boolean check = false;
           System.out.println("복권 확인 [1][2][3]");
           int select = sc.nextInt();
           int count = 0;
           if(select == 1){
               for(int i = 0; i < arr1.length; i++){
                   if(arr1[i] == 7){
                       count += 1;
                       if(count == 3){
                           check = true;
                           break;
                        }
                    }else count = 0;
                }
                if(check) System.out.println("당첨");
                else System.out.println("꽝");
           }else if(select == 2){
            for(int i = 0; i < arr2.length; i++){
                if(arr2[i] == 7){
                    count += 1;
                    if(count == 3){
                        check = true;
                        break;
                     }
                 }else count = 0;
             }
             if(check) System.out.println("당첨");
             else System.out.println("꽝");
           }else if(select == 3){
            for(int i = 0; i < arr3.length; i++){
                if(arr3[i] == 7){
                    count += 1;
                    if(count == 3){
                        check = true;
                        break;
                     }
                 } else count = 0;
             }
             if(check) System.out.println("당첨");
             else System.out.println("꽝");
           }else break;
        }
        sc.close();
    }
}