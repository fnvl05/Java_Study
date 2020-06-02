package vsTest01;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        String [] game = new String [9];
        int play = 0;
        int win = -1;
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < game.length; i++){
            game[i] = "[ ]";
        }
        
        while(win == -1){
            for(int i = 0; i < game.length; i++){
                    System.out.print(game[i] + " ");
                if(i % 3 == 2){
                    System.out.println();
                }
            }
            if(play % 2 == 0){
                System.out.println("인덱스를 입력 [1]");
                int index1 = sc.nextInt();
                if(game[index1].equals("[ ]")){
                    game[index1] = "[o]";
                    play += 1;
                }else {System.out.println("불가능");}
            }else if(play % 2 == 1){
                System.out.println("인덱스를 입력 [2]");
                int index2 = sc.nextInt();
                if(game[index2].equals("[ ]")){
                    game[index2] = "[x]";
                    play += 1;
                }else {System.out.println("불가능");}
            }
                for(int i = 0; i < game.length - 2; i++){
                    if(game[i].equals("[o]") && game[i + 1].equals("[o]") && game[i + 2].equals("[o]")){
                        win = 1;
                        break;
                    }else if(game[i].equals("[x]") && game[i + 1].equals("[x]") && game[i + 2].equals("[x]")){
                        win = 2;
                        break;
                    }
                }
                for(int i = 0; i < game.length - 6; i++){
                    if(game[i].equals("[o]") && game[i + 3].equals("[o]") && game[i + 6].equals("[o]")){
                        win = 1;
                        break;
                    }else if(game[i].equals("[x]") && game[i + 3].equals("[x]") && game[i + 6].equals("[x]")){
                        win = 2;
                        break;
                    }
                }
                for(int i = 0; i < game.length - 4; i++){
                    if(game[i].equals("[o]") && game[i + 2].equals("[o]") && game[i + 4].equals("[o]")){
                        win = 1;
                        break;
                    }else if(game[i].equals("[x]") && game[i + 2].equals("[x]") && game[i + 4].equals("[x]")){
                        win = 2;
                        break;
                    }
                }  
            }
            System.out.printf("%d 의 승리", win);
            sc.close();
        }
        
    }