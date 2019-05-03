package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;
//import jpu2016.gameframe.keyEvent;

public class EventPerformer implements IEventPerformer {
	//private DogfightView eventPerformer=new DogfightView(IOrderPerformer orderPerformer);
	
	private IOrderPerformer orderPerformer;
	public EventPerformer() {
		super();
		// TODO Auto-generated constructor stub
		//IOrderPerformer orderPerformer
		
	}
	private UserOrder keyCodeToUserOrder(int keyOrder) {
		return null;
	}
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
	

}
