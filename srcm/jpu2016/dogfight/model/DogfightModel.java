package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky;
	private IMobile player;
	private ArrayList<IMobile> mobiles;
	public DogfightModel() {
		mobiles = new ArrayList<IMobile>();
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return sky;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addMobile(IMobile mobile) {
		// TODO Auto-generated method stub
		mobiles.add(mobile);

	}

	@Override
	public void removeMobile(IMobile mobile) {
		// TODO Auto-generated method stub
		mobiles.remove(mobile);

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
