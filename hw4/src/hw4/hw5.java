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
      		System.out.println("결과 : 색상이 변경되지 않았으며, 속도가 0에서"+speed+"으로 변경되었습니다.");
      		}
	      else if (color.equals("red")){
	    	System.out.println("결과 : 색상이 black에서"+color+"으로 변경되었고, 속도가 0에서"+speed+"으로 변경되었습니다."); }
	      else if(color.equals("white")){ 
	    	System.out.println("결과 : 색상이 black에서"+color+"으로 변경되었고, 속도가 0에서"+speed+"으로 변경되었습니다."); }
	      
	   		}	  
		}

public class hw5 {
	   public static void main(String[] args) {
		     
		      String color;
		      int value;
		      
		      Scanner s = new Scanner(System.in);
		      
		      Car myCar = new Car();

		      System.out.print("변경하고자하는 색상을 black, red, white 중에 입력하세요: ");
		      color = s.nextLine();
		      System.out.println(color);
		      if ((color=="red")|(color=="white")|(color=="black")){
			      System.out.println("변경하고자 하는 속도를 입력하세요. : ");
			      value = s.nextInt();
			      myCar.Modify(value,color);		
		       }else{
		    	  System.out.println("pp다시 입력해주세요");
		      color = s.nextLine();}
		      
		   
		}

}