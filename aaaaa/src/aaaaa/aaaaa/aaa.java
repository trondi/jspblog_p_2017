package aaaaa;
import java.io.Console;
import java.util.Scanner;
public class aaa {


	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int com[] = new int[6];
	      int select[] = new int[6];
	      int i, j;
	      int count = 0;

	      /*for (i = 0; i < com.length; i++) {
	         com[i] = (int) (Math.random() * 45 )+ 1; // com[] 1~45까지 랜덤 수
	         
	         for (j = 0; j < i; j++) {
	            if (com[i] == com[j]) { //^^ 같으면 다시 입력받기
	               i--;
	               break;// ^^ 안쪽 for문 빠져나가라
	            }
	         }
	      } //^^ 랜덤 숫자를 가져오는 대신 같은 숫자가 하나라도 나오면 안됨. for문,if문*/
	      

	      for (i = 0; i < select.length; i++) {
	         do { //^^ 일단 어떤 값이든 상관 없이 입력 받아야함(do while)
	            System.out.print(i + 1 + "번째 수를 입력:");
	            select[i] = s.nextInt();
	         } while (select[i] < 1 || select[i] > 45); //^^ 1~45까지의 수만 입력해야함
	         //^^ do while문 조건 참이면 조건동안 do문 실행,조건 거짓이면 while문 종료
	                
	         System.out.print(i+"\n");
	         
	         /*for (j = 0; j < i; j++) { //^^ 배열 비교할 때 for문
	            if (select[i] == select[j]) {
	               i--; //^^ 같으면 다시 비교 해야돼서 i가 증가하면 안되므로 i를 원래 상태로 만들어줌
	               break;
	            }
	         }*/
	      } //^^ 같은 숫자가 하나라도 나오면 안됨.(랜덤 숫자를 가져왔을 때 처럼) 
	      
	      // com[]배열에 있는 값과 select[]에 있는 값을 비교하여 맞은 갯수를 체크한다.
	      /*for (i = 0; i < com.length; i++) {
	         for (j = 0; j < select.length; j++) {
	            if (com[i] == select[i]) {
	               count++;
	               break;
	            }
	         }
	      } */ 
	      System.out.println(count + "개를 맞추었습니다.");

	      s.close();
	   }

	
}
