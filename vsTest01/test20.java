package vsTest01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int y = -1;
    int x = -1;
    int dir = 0;
}

public class test20 {

    public static void main(String[] args) {
        //문제) 값이 0인곳의 인덱스를 입력 받고 0이 연결된 갯수 출력 (대각선포함)

        // 2차항 배열의 최대 값
        final int MAX_Y = 5;
        final int MAX_X = 6;
        // 방향 설정 (바뀌지 않는 값 -> 상수로 설정)
        final int 북 = 0;
        final int 북동 = 1;
        final int 북서 = 2;
        final int 남 = 3;
        final int 남서 = 4;
        final int 남동 = 5;
        final int 동 = 6;
        final int 서 = 7;
        // 방향을 설정한 값보다 높으면 안된다.
        final int NONE = 8;

        int mine[][] = {    { 0, 0, 0, 0, 1, 1 }, 
                            { 1, 1, 1, 1, 0, 0 }, 
                            { 0, 1, 1, 1, 1, 1 }, 
                            { 0, 1, 1, 1, 0, 0 },
                            { 0, 0, 0, 1, 1, 0 } };
        // 0 을 임의 값으로 바꿀 수
        int count = 2;

        // 임의 값이 들어갈 배열
        int[][] mark = new int[MAX_Y][MAX_X];

        // list를 이용하여 node의 y,x,dir를 저장
        List<Node> nodeList = new ArrayList<>();
        
        //node 클레스
        Node node = new Node();

        //Scanner 클레스
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            // 입력받는다.
            System.out.println("[Y] 인덱스 입력");
            int y = sc.nextInt();
            System.out.println("[X] 인덱스 입력");
            int x = sc.nextInt();
            // 0의 연결 갯수를 구해야 하기 때문에 0이 아닌수에는 입력할 수 없다.
            if(mine[y][x] != 0){
                System.out.println("어림없지!");
                continue;
            // 0일경우 입력받은 y , x 를 node 클레스 변수에 넣어준다.
            }else if(mine[y][x] == 0){
                node.y = y;
                node.x = x;
                node.dir = 북;
                // 리스트에 저장
                nodeList.add(node);
            }
            while (true) {
                // 저장된 리스트가 없으면 끝내버린다.
                if (nodeList.size() == 0) {
                    break;
                }
                // 저장되있는 초기값을 가져온다.
                node = nodeList.get(0);
                // 가져온 값을 이용하여 mark에 count를 대입
                mark[node.y][node.x] = count;
                if(mine[node.y][node.x] == 0){
                    mine[node.y][node.x] = count;
                }
                while (true) {
                    // 설정한 방향의 값이 커질때 리스트에서 지워버린다.
                    if (node.dir >= NONE) {
                        nodeList.remove(0);
                        break;
                    }

                    int yy = node.y;
                    int xx = node.x;
                    
                    //방향 검사
                    if(node.dir == 북){
                        yy = yy - 1;
                    }else if(node.dir == 북서){
                        yy = yy - 1;
                        xx = xx - 1;
                    }else if(node.dir == 북동){
                        yy = yy - 1;
                        xx = xx + 1;
                    }else if(node.dir == 남){
                        yy = yy + 1;
                    }else if(node.dir == 남동){
                        yy = yy + 1;
                        xx = xx + 1;
                    }else if(node.dir == 남서){
                        yy = yy + 1;
                        xx = xx - 1;
                    }else if(node.dir == 동){
                        xx = xx + 1;
                    }else if(node.dir == 서){
                        xx = xx - 1;
                    }
                    node.dir += 1;
                    
                    // 배열 인덱스에 들어갈 수 없는 값이라면 continue로 밑의 코드를 무시하고 다음 처음 반복문으로 이동한다.
                    if(yy < 0 || yy >= MAX_Y || xx < 0 || xx >= MAX_X){
                        continue;
                    }else if(mark[yy][xx] == count){ // 이미 값이 있으므로 다시 검사.
                        continue;
                    }else if(mine[yy][xx] == 0 && mark[yy][xx] == 0){ // 0을 발견!!
                        Node newNode = new Node();
                        newNode.y = yy;
                        newNode.x = xx;
                        newNode.dir = 북;
                        nodeList.add(newNode);
                    }
                }
            }
            int check = 0; // 0을 임의의 수로 바꾼 수를 세기위한 값
            int zero = 0; // 반복문을 끝내기 위한 값
            for(int i = 0; i < MAX_Y; i++){
                for(int j = 0; j < MAX_X; j++){
                    System.out.print(mark[i][j] + " ");
                    if(mark[i][j] == count){
                        check += 1;
                    }
                }
                System.out.println();
            }
            System.out.println();
            // 0이 없으면 zero는 그대로 0 이다.
            // 0이 있다면 zero는 1이다.
            for(int i = 0; i < MAX_Y; i++){
                for(int j = 0; j < MAX_X; j++){
                    if(mine[i][j] == 0){
                        zero = 1;
                        break;
                    }
                }
                if(zero == 1){
                    break;
                }
            }
            // 0이 더이상 없으므로 반복문이 종료된다.
            if(zero == 0){
                run = false;
            }
            System.out.println("폭탄!!: " + check);
            count += 1;
        }
        sc.close();
    }
}