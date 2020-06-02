package vsTest01;

import java.util.Scanner;

public class test06 {
    /*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {0, 0, 0, 0, 0};
        int i = 0;
        int money = 0;
        do{
            for(int temp : arr){
                System.out.print(temp);
            }
            System.out.println();
            System.out.println("예약할 자리를 인덱스를 입력");
            int index = sc.nextInt();
            if(index < arr.length){
                if(arr[index] == 0){
                    arr[index] = 1;
                    money += 12000;
                    i += 1;
                    System.out.println("예약되었습니다.");
                }else {
                    System.out.println("이미 예약되었습니다.");
                }
            }else{
                System.out.println("잘못된 입력입니다.");
            }
            System.out.println("총 금액: " + money); 
        }while(i < arr.length);
        sc.close();
    }
}