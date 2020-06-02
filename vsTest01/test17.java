package vsTest01;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        /*
 * # 미니마블
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 * 
 */
        int [] player1 = new int [9];
        int [] player2 = new int [9];
        int [] player3 = new int [9];

        int playCount = 0;
        int player1Moving = 0;
        int player2Moving = 0;
        int player3Moving = 0;

        int player1Turn = 0;
        int player2Turn = 0;
        int player3Turn = 0;

        boolean gameOver = true;
        
        Scanner sc = new Scanner(System.in);

        while(gameOver){
            for(int temp : player1){
                System.out.print(temp + " ");
            }
            System.out.println("\n========== 1P ===========");
            for(int temp : player2){
                System.out.print(temp + " ");
            }
            System.out.println("\n========== 2P ===========");
            for(int temp : player3){
                System.out.print(temp + " ");
            }
            System.out.println("\n========== 3P ===========");
            if(playCount % 3 == 0){
                System.out.println("1P 입력");
                int moveP1 = sc.nextInt();
                player1[player1Moving] = 0;
                player1Moving += moveP1;
                if(player1Moving >= 9){
                    player1Moving %= 9;
                    player1Turn += 1;
                }
                player1[player1Moving] = 1;
                if(player2[player1Moving] == 2){
                    player2[player2Moving] = 0;
                    player2Moving = 0;
                    player2[player2Moving] = 2;
                }
                if(player3[player1Moving] == 3){
                    player3[player3Moving] = 0;
                    player3Moving = 0;
                    player3[player3Moving] = 3;
                }
                if(player1Turn == 3){
                    System.out.println("1P 승리");
                    gameOver = false;
                }
                playCount += 1;
            }else if(playCount % 3 == 1){
                System.out.println("2P 입력");
                int moveP2 = sc.nextInt();
                player2[player2Moving] = 0;
                player2Moving += moveP2;
                if(player2Moving >= 9){
                    player2Moving %= 9;
                    player2Turn += 1;
                }
                player2[player2Moving] = 2;
                if(player1[player2Moving] == 1){
                    player1[player1Moving] = 0;
                    player1Moving = 0;
                    player1[player1Moving] = 1;
                }
                if(player3[player2Moving] == 3){
                    player3[player3Moving] = 0;
                    player3Moving = 0;
                    player3[player3Moving] = 3;
                }
                if(player2Turn == 3){
                    System.out.println("2P 승리");
                    gameOver = false;
                }
                playCount += 1;
            }else if(playCount % 3 == 2){
                System.out.println("3P 입력");
                int moveP3 = sc.nextInt();
                player3[player3Moving] = 0;
                player3Moving += moveP3;
                if(player3Moving >= 9){
                    player3Moving %= 9;
                    player3Turn += 1;
                }
                player3[player3Moving] = 3;
                if(player2[player3Moving] == 2){
                    player2[player2Moving] = 0;
                    player2Moving = 0;
                    player2[player2Moving] = 2;
                }
                if(player1[player3Moving] == 1){
                    player1[player1Moving] = 0;
                    player1Moving = 0;
                    player1[player1Moving] = 1;
                }
                if(player3Turn == 3){
                    System.out.println("3P 승리");
                    gameOver = false;
                }
                playCount += 1;
            }
        }
        sc.close();
    }
}