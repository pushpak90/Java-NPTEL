public class Point {
	double x,y;
	double distance(Point p1, Point p2)
	{
		double result;
		result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
 		System.out.print(result);
		return result;		
	}
}