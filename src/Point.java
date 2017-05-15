import java.util.Random;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public static Point generateRandomPoint(){
		Random rand = new Random();
		return new Point(
					rand.nextInt(Main.WIDTH+1), 
					rand.nextInt(Main.HEIGHT+1)
				);
	}
	public static double distanceBetweenPoints(Point point1, Point point2){
		return Math.sqrt( Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2));
	}
	
	
	@Override
	public String toString() {
		return "Point:["+x+", " + y + "]";
	}
	
	// Getters and setters
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
}
