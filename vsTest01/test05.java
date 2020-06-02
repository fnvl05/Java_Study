package vsTest01;

import java.util.Random;

public class test05 {
    /* # OMR카드
    * 1. 배열 answer는 시험문제의 정답지이다.
    * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
    * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
    * 4. 한 문제당 20점이다.
    * 예)
    * answer = {1, 3, 4, 2, 5}
    * hgd    = {1, 1, 4, 4, 3}
    * 정오표     = {O, X, O, X, X}
    * 성적        = 40점
    */
   public static void main(String[] args) {
       int [] answer = {4, 3, 5, 2, 1};
       int [] hgd = new int [5];
       String [] omr = new String [5];
       int total = 0;
       Random random = new Random();
       
       for(int i = 0; i < hgd.length; i++){
           int ran = random.nextInt(5) + 1;
           hgd[i] = ran;
           if(answer[i] == hgd[i]){
            total += 20;
            omr[i] = "o";
           }else {
               omr[i] ="x";
           }
       }
       for(int temp : answer){
           System.out.print(temp + " ");
       }
       System.out.println();
       for(int temp : hgd){
           System.out.print(temp + " ");
       }
       System.out.println();
       for(String temp : omr){
           System.out.print(temp + " ");
       }
       System.out.println();
       System.out.println("점수 : " + total);
   }
   
   
}