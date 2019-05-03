package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem;
	private static int TIME_SLEEP=30;

	public DogfightController(IDogfightModel dogfightModel) {
		super();
		// TODO Auto-generated constructor stub
	//	this.dogfightModel=dogfightModel;
	}
	private void gameLoop() {
		
	}
	private void launchMissile(int player) {
		
	}
	public void play() {
		
	}
	public static void orderPerform(UserOrder userOrder) {
		
	}
	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}
	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	public IViewSystem getViewSystem() {
		return viewSystem;
	}
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}

	

}

