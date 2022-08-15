import java.util.Scanner;

public class Exercise3_2 extends Point{
	
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Exercise3_2 c1=new Exercise3_2();
	c1.distance(p1,p2);
	
  }

}