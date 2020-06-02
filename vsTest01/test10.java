package vsTest01;

import java.util.Random;

public class test10 {
    /*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 */
    public static void main(final String[] args) {
        final int [] arr = new int [5];
        final int [] check = new int [5];
        
        final Random random = new Random();
        
        for(int i = 0; i < arr.length; i++){
            final int ran = random.nextInt(5);
            // arr[i] = ran;
            if(check[ran] != 1){
                arr[i] = ran;
                check[ran] = 1;
            }else{
                i -= 1;
            }
        }
        for(final int temp : arr){
            System.out.println(temp);
        }
    }
}