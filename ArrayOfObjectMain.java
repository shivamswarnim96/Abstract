package Abstract;

public class ArrayOfObjectMain {
	
	public static void main(String[] args) {
		
		Rectangle r[]=new Rectangle[3];
		
		Figure figure;
		
		r[0]= new Rectangle(10.0, 10.0);
		r[1]= new Rectangle(10.0, 20.0);
		r[2]= new Rectangle(10.0, 30.0);
		
		for (Rectangle rectangle : r) {
			
			figure=rectangle;
			
			System.out.println("Area is " + figure.area());
			
		}
		
	}

}
