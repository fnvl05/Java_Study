package vsTest01;

import java.util.Scanner;

public class test13 {
    /*
    * # 숫자이동[1단계]
    * 1. 숫자2는 캐릭터이다.
    * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
    * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
    * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] game = {0, 0, 0, 2, 0, 0, 0};
        int player = 0;
        for(int i = 0; i < game.length; i++){
            if(game[i] == 2){
                player = i;
                break;
            }
        }
        while(true){
            for(int temporary : game){
                System.out.print(temporary + " ");
            }
            System.out.println();
            System.out.print("[1]은 < [2]은 > [3]은 종료");
            int move = sc.nextInt();
            if(move == 1){
                if(player > 0){
                    game[player - 1] = 2;
                    game[player] = 0;
                    player -= 1;
                }else {
                    System.out.println("불가능");
                }
            }else if(move == 2){
                if(player <= 5){
                    game[player + 1] = 2;
                    game[player] = 0;
                    player += 1;
                }else System.out.println("불가능");
            }else break; 
        }
        sc.close();
    }
}