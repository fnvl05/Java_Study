package vsTest01;

public class test12 {
    public static void main(String[] args) {
        /*
        * # 4의 배수만 저장
        * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
        */

        int[] arr = {44, 11, 29, 24, 76, 80, 50};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 4 == 0){
                count += 1;
            }
        }
        int [] temp = new int [count];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 4 == 0){
                temp[j] = arr[i];
                j += 1;
            }
        }
        for(int temporary : temp){
            System.out.println(temporary);
        }
    }
}