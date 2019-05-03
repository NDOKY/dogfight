package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

public class Mobile implements IMobile {
	private int speed;
	private Direction direction;
	private Dimension dimension;
	private Position position;
	private  Image images;
	private Color color;
	private DogfightModel dogfightModel;
	private Point point;
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.dimension = dimension;
		this.direction= direction;
		this.position= position;
		this.speed= speed;
	}
	
	private void moveUp() {
		direction = Direction.UP;
	}
	private void moveRight() {
		direction = Direction.RIGHT;
	}
	private void moveDown() {
		direction = Direction.DOWN;
	}
	private void moveLeft() {
		direction = Direction.LEFT;
	}
	public Color getColor() {
		return color ;
		
	}
	public IDogfightModel getDogfightModel() {
		 DogfightModel dogfightModel = new DogfightModel();
		return dogfightModel ;
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
         this.direction = direction;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		this.dogfightModel= dogfightModel;
	}
	
	@Override
	
	public Image getImage() {
		return images;
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		
		return point;
	}

}
