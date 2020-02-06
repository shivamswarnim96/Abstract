package Abstract;

public class AbstractAreas {
	
	public static void main(String args[]) {
		
//		Figure f = new Figure(10, 10);// illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		Figure figre;// this is OK, no object is created
		
		figre = r;
		System.out.println("Area is " + figre.area());
		
		figre = t;
		System.out.println("Area is " + figre.area());

	}

}