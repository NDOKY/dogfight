package dogfightmodel;

public class Cloud extends Mobile{
	
	private static int SPEED=1;
	private static int WIDTH=300;
	private static int HEIGHT=150;
	private static String IMAGE= "cloud";
	
	
	
	public Cloud(Direction direction, Position position, Dimension dimension, int speed, String image) {
		super(direction, position, dimension, speed, image);
		// TODO Auto-generated constructor stub
	}

	public Cloud(Direction direction, Dimension dimension) {
		super();
		
	}

}
