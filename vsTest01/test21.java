package vsTest01;

import java.util.Scanner;

public class test21 {
	public static void main(String[] args) {
		//간단한 1차 숫자 이동
		final int PLAYER = 2;
		final int WALL = 1;
		int playerIndex = 3;

		int [] arr = {0, 1, 0, 2, 0, 0, 0};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\n이동합니다. [1]. < [2]. >");
			int moving = sc.nextInt();
			
			int index = playerIndex;
			
			if(moving == 1) {index -= 1;}
			else if(moving == 2){index += 1;}
			
			if(index < 0 || index >= arr.length) continue;
			if(arr[index] == WALL) continue;
			
			arr[playerIndex] = 0;
			playerIndex = index;
			arr[playerIndex] = PLAYER;
			
			if(moving == 100) break;
		}
		sc.close();
	}
}
