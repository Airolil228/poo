package dessin;

public class Test {
		public static void main(String[] args) {
			Point p1 = new Point();
			Point p2 = new Point();
		
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			
			System.out.println("Distance : " +  p1.distance(p2));
			System.out.println("Distance : " +  p1.distance());
			
			
		}
}
