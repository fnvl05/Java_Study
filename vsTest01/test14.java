package vsTest01;

import java.util.Random;
import java.util.Scanner;

public class test14 {
    /*
    * # 기억력 게임
    * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
    * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
    *    back에 모든 수가 채워지면 게임은 종료된다.
    * 예)
    * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
    * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    * 입력1 : 0
    * 입력2 : 1
    * 
    * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
    * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
    */

    public static void main(String [] args){

        
        int [] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int [] back = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        for(int i = 0; i < 1000; i++){
            int ran = random.nextInt(front.length);
            int temp = front[ran];
            front[ran] = front[0];
            front[0] = temp;
        }


        int run = 0;

        while(run < front.length / 2){
            for(int temp : front){
                System.out.print(temp + " ");
            }
            System.out.println();
            for(int temp : back){
                System.out.print(temp + " ");
            }
            System.out.println();

            System.out.println("인덱스를 입력[1]");
            int index1 = sc.nextInt();
            System.out.println("인덱스를 입력[2]");
            int index2 = sc.nextInt();

            if(front[index1] == front[index2]){
                back[index1] = front[index1];
                back[index2] = front[index2];
                run += 1;
            }
        }
       sc.close();
    }      
}