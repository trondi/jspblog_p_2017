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
	         com[i] = (int) (Math.random() * 45 )+ 1; // com[] 1~45���� ���� ��
	         
	         for (j = 0; j < i; j++) {
	            if (com[i] == com[j]) { //^^ ������ �ٽ� �Է¹ޱ�
	               i--;
	               break;// ^^ ���� for�� ����������
	            }
	         }
	      } //^^ ���� ���ڸ� �������� ��� ���� ���ڰ� �ϳ��� ������ �ȵ�. for��,if��*/
	      

	      for (i = 0; i < select.length; i++) {
	         do { //^^ �ϴ� � ���̵� ��� ���� �Է� �޾ƾ���(do while)
	            System.out.print(i + 1 + "��° ���� �Է�:");
	            select[i] = s.nextInt();
	         } while (select[i] < 1 || select[i] > 45); //^^ 1~45������ ���� �Է��ؾ���
	         //^^ do while�� ���� ���̸� ���ǵ��� do�� ����,���� �����̸� while�� ����
	                
	         System.out.print(i+"\n");
	         
	         /*for (j = 0; j < i; j++) { //^^ �迭 ���� �� for��
	            if (select[i] == select[j]) {
	               i--; //^^ ������ �ٽ� �� �ؾߵż� i�� �����ϸ� �ȵǹǷ� i�� ���� ���·� �������
	               break;
	            }
	         }*/
	      } //^^ ���� ���ڰ� �ϳ��� ������ �ȵ�.(���� ���ڸ� �������� �� ó��) 
	      
	      // com[]�迭�� �ִ� ���� select[]�� �ִ� ���� ���Ͽ� ���� ������ üũ�Ѵ�.
	      /*for (i = 0; i < com.length; i++) {
	         for (j = 0; j < select.length; j++) {
	            if (com[i] == select[i]) {
	               count++;
	               break;
	            }
	         }
	      } */ 
	      System.out.println(count + "���� ���߾����ϴ�.");

	      s.close();
	   }

	
}
