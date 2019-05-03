package dogfightmodel;

public class Cloud extends Mobile{
	
	private static int SPEED=1;
	private static int WIDTH=300;
	private static int HEIGHT=150;
	private static String IMAGE= "cloud";
	
	

	public Cloud(Direction direction, Dimension dimension) {
		super(direction, new Position(1, 2, 3, 4), dimension, SPEED, IMAGE );
		
	}

}
