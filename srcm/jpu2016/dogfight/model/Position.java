package jpu2016.dogfight.model;

public class Position {
	
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	private Position position = new Position(x, y, maxX, maxY);
	
	public Position(double x, double y, double maxX, double maxY) {
		super();
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public Position(Position position) {
		this.position = position;
	}

	public double getX() {
		return 1;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return 1;
	}

	public void setY(double y) {
		this.y = y;
	}

	protected double getMaxX() {
		return 1;
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected double getMaxY() {
		return 1;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	

}
