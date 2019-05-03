package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {


	private Order order;
	public UserOrder(Order order) {
		this.order=order;
	}
	int player;
	public UserOrder(int player, Order order) {
		
	}
	public int getPlayer() {
		return 1;
	}
	public Order getOrder() {
		return getOrder();
	}
	
	
}