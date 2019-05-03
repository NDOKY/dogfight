package jpu2016.dogfight.model;

public class Missile extends Mobile{
	
	private static int SPEED=4;
	private static int WIDTH=30;
	private static int HEIGHT=10;
    private static int MAX_DISTANCE_TRAVELED=1400;
    private static String IMAGE= "missile";
    private int distanceTraveled=0;
    
    
   public Missile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		super(direction, position, dimension, speed, image);
		// TODO Auto-generated constructor stub
	}

    
    public static int getWidthWithADirection(Direction direction) {
		return HEIGHT;
    	
    }
    
public static int getHeightWithADirection(Direction direction) {
	return HEIGHT;
    	
    }

    public void move() {
    	
    }
    
    public boolean isWeapon() {
		return false;
    	
    }
    
}
