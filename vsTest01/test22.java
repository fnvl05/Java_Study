package vsTest01;

import java.util.Scanner;

public class test22 {
	public static void main(String[] args) {
		//������ 2�� �����̵�
		int [][] arr = {
				{0, 0, 0, 0, 0},
				{0, 1, 0, 1, 0},
				{0, 0, 2, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0}
		};
		final int WALL = 1; 	// 벽
		final int PLAYER = 2; 	// 플레이어
		final int SIZE = 5; 	// 5X5 2차 배열 크기
		int playerY = -1;		// 플레이어 좌표  / 플레이어를 찾지 못하면 에러
		int playerX = -1;
		
		Scanner sc = new Scanner(System.in);
		
		// 플레이어 Y,X 값 찾기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == PLAYER) {
					playerY = i;
					playerX = j;
				}
			}
		}
		
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] ==  PLAYER) {
						System.out.print("＠" + " ");
					}
					else if(arr[i][j] == WALL) {
						System.out.print("■" + " ");
					}else {
						System.out.print("□" + " ");
					}
				}
				System.out.println();
			}
			System.out.println("[←].1, [↑].2, [↓].3, [→].4");
			int moving = sc.nextInt();
			
			// 이동값 선언
			int y = playerY;
			int x = playerX;
			
			// 이동 값 변환
			if(moving == 1) {
				x -= 1;
			}else if(moving == 2) {
				y -= 1;
			}else if(moving == 3) {
				y += 1;
			}else if(moving == 4) {
				x += 1;
			}
			
			// 예외처리
			if(y < 0 || y >= SIZE || x < 0 || x >= SIZE) continue;
			if(arr[y][x] == WALL)continue;
			
			// 이동!
			arr[playerY][playerX] = 0;	
			playerY = y;
			playerX = x;
			arr[playerY][playerX] = PLAYER;
			
			// 반복문 종료
			if(moving == 100) break;
		}
		// 메모리 닫기
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
