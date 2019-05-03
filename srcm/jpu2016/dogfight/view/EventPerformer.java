package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;
//import jpu2016.gameframe.keyEvent;

public class EventPerformer implements IEventPerformer {
	//private DogfightView eventPerformer=new DogfightView(IOrderPerformer orderPerformer);
	
	private IOrderPerformer orderPerformer;
	private IEventPerformer performer;
	private UserOrder userorder;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		super();
		// TODO Auto-generated constructor stub
		//IOrderPerformer orderPerformer
		this.performer=performer;
		
	}
	private UserOrder keyCodeToUserOrder(int keyOrder) {
		return userorder;
	}
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	public IEventPerformer getPerformer() {
		return performer;
	}
	public void setPerformer(IEventPerformer performer) {
		this.performer = performer;
	}
	
	
	

}
