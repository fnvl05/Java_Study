package vsTest01;

import java.util.ArrayList;
import java.util.List;

class Move{
    int y = -1;
    int x = -1;
    int dir = 0;
}

public class test19 {
    public static void main(String[] args) {
        
        // 아래 와 같은 미로가 있다. 0 == 길 , 1 == 벽 2 == 시작 ,  3 == 도착 
        // 2가 3까지 도착하면 도착지 출력 
        
        int map[][] = {
            {1,2,0,0,1},
            {1,1,0,1,1},
            {0,1,0,0,0},
            {0,0,0,1,1},
            {0,1,0,3,0}
        };  
        
        final int MAX_SIZE = 5;
        final int NORTH = 0;
        final int EAST = 1;
        final int SOUTH = 2;
        final int WEST = 3;	
        final int NONE = 4;
        
        int [][] mark = new int [MAX_SIZE][MAX_SIZE];
        List<Move> moveList = new ArrayList<>();
        Move move = new Move();
        // 2 가 있는 위치
        for(int i = 0; i < MAX_SIZE; i++){
            for(int j = 0; j < MAX_SIZE; j++){
                if(map[i][j] == 2){
                    move.y = i;
                    move.x = j;
                    move.dir = NORTH;
                }
            }
        }
        // 첫번째 움직임
        moveList.add(move);
        boolean run = true;
        while(run){
        // 움직임이 없으므로 종료
            if(moveList.size() == 0){
                System.out.println("출구가 없습니다.");
                run = false;
            }
            move = moveList.get(0);
            mark[move.y][move.x] = 1; // 갈 수 있는 길을 1로 표기한다.
            
            while(true){
                if(move.dir >= NONE){ // 설정한 방향 값보다 크면 삭제
                    moveList.remove(0);
                    break;
                }
                int yy = move.y;
                int xx = move.x;

                // 방향 확인
                if(move.dir == NORTH){
                    yy = move.y - 1;
                }else if(move.dir == EAST){
                    xx = move.x + 1;
                }else if(move.dir == WEST){
                    xx = move.x - 1;
                }else if(move.dir == SOUTH){
                    yy = move.y + 1;
                }
                move.dir += 1;
                // 예외사항 처리
                if(yy < 0 || yy >= MAX_SIZE || xx < 0 || xx >= MAX_SIZE){ // 배열 예외
                    continue;
                }else if(mark[yy][xx] == 1){ // 확인이 끝났다.
                    continue;
                }else if(map[yy][xx] == 0 && mark[yy][xx] == 0){ // 갈 수 있는길.
                    System.out.println("확인 : " + yy + " " + xx);
                    Move newMove = new Move();
                    newMove.y = yy;
                    newMove.x = xx;
                    newMove.dir = NORTH;
                    moveList.add(newMove);
                }else if(map[yy][xx] == 3){ // 길을 찾아서 도착지점으로 이동했다.
                    System.out.println("도착 : " + yy + " " + xx);
                    run = false;
                }
            }
        }
    }
}