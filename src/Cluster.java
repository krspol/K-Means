import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Cluster {
	
	public static int ids = 0;
	
	private Point centoid;
	private List<Point> points;
	private Color color;
	private int id; 
	
	public Cluster(Point centroid) {
		this.centoid = centroid;
		points = new ArrayList<>();
		id = ids++;
	}
	
	
	
	// Getters and setters
	
	public void addPoint(Point point){
		points.add(point);
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	
}
