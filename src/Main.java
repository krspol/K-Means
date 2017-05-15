import java.util.ArrayList;
import java.util.List;

public class Main {

	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	public static final int MAX_CLUSTER = 4;
	public static final int MAX_POINTS = 300;
	
	private List<Point> allPoints;
	private List<Cluster> allClusters;
	
	public static void main(String[] args){
		
		
	}
	
	public void init(){
		 allPoints = new ArrayList<>();
		 allClusters = new ArrayList<>();
		 
		 for(int i=0; i < MAX_POINTS; i++)
				allPoints.add(Point.generateRandomPoint());
		 
		 for(int i=0; i < MAX_CLUSTER; i++)
			 allClusters.add( new Cluster( Point.generateRandomPoint()));
			
	}
}
