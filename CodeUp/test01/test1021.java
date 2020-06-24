package CodeUp.test01;

import java.util.Scanner;

public class test1021 {
   public static void main(String[] args) {
       //1021 단어 1개를 입력받아 그대로 출력하기
       final int WORD_SIZE = 50;

       Scanner sc = new Scanner(System.in);

       System.out.println("단어를 입력 (문자의 길이는 50자 이하이다)");
       String word = sc.next();
       
       if(word.length() <= WORD_SIZE){
           System.out.printf("%s",word);
       }else {
           System.out.println("50자를 초가 했습니다.");
       }

       sc.close();
   } 
}