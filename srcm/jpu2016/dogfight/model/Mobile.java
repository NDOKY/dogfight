package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
	private int speed;
	private Direction direction;
	private Dimension dimension;
	private Position position;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.dimension = dimension;
		this.direction= direction;
		this.position= position;
		this.speed= speed;
		Image images;
	}
	
	private void moveUp() {
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	public Color getColor() {
		return null;
		
	}
	public IDogfightModel getDogfightModel() {
		return null;
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
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
		
	}
	
	@Override
	
	public Image getImage() {
		return null;
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
