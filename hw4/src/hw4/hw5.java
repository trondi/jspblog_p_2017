package hw4;

import java.util.Scanner;

class Car{
	   private String color;
	   private int speed;
	   private int value;
	   
	   Car() {
	      color = "black";
	      speed = 0;
	   }
	   
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
		    public int getValue() {
				return value;
			}
			public void setValue(int value) {
				this.value = value;
			}

	   public void Modify(int value, String color) {

		if(value==0)
	         speed = value;
	      else if (speed + value > 200)
	         speed = 200;
	      else if (speed + value < 0)
	         speed = 0;
	      else
	         speed+=value;
		
      	if (color.equals("black")) {
      		System.out.println("��� : ������ ������� �ʾ�����, �ӵ��� 0����"+speed+"���� ����Ǿ����ϴ�.");
      		}
	      else if (color.equals("red")){
	    	System.out.println("��� : ������ black����"+color+"���� ����Ǿ���, �ӵ��� 0����"+speed+"���� ����Ǿ����ϴ�."); }
	      else if(color.equals("white")){ 
	    	System.out.println("��� : ������ black����"+color+"���� ����Ǿ���, �ӵ��� 0����"+speed+"���� ����Ǿ����ϴ�."); }
	      
	   		}	  
		}

public class hw5 {
	   public static void main(String[] args) {
		     
		      String color;
		      int value;
		      
		      Scanner s = new Scanner(System.in);
		      
		      Car myCar = new Car();

		      System.out.print("�����ϰ����ϴ� ������ black, red, white �߿� �Է��ϼ���: ");
		      color = s.nextLine();
		      System.out.println(color);
		      if ((color=="red")|(color=="white")|(color=="black")){
			      System.out.println("�����ϰ��� �ϴ� �ӵ��� �Է��ϼ���. : ");
			      value = s.nextInt();
			      myCar.Modify(value,color);		
		       }else{
		    	  System.out.println("pp�ٽ� �Է����ּ���");
		      color = s.nextLine();}
		      
		   
		}

}