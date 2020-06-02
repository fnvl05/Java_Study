package vsTest01;

public class test08 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};		
		int temp4[] = new int[5];
		
		//문제1) arr의 값을 temp4에 거꾸로 복사후 출력 
		// 예) temp4 ==> {50,40,30,20,10}

        for(int i = arr.length - 1; i >= 0; i--){
            temp4[i] = arr[i];
        }

        for(int temp : temp4){
            System.out.println(temp);
        }

    }
}