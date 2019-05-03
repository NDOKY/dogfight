package jpu2016.dogfight.view;
import java.lang.Runnable;

import java.util.Observable;

//import jpu2016.dogfightmodel.*;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
import jpu2016.gameframe.IEventPerformer;
//import jpu2016.gameframe.IEventperformer;
import jpu2016.gameframe.IGraphicsBuilder;

public class DogfightView implements Runnable, IViewSystem {

	private Observable observable;
	private IGraphicsBuilder graphicBuilder;
	GameFrame gameFrame;
	IGraphicsBuilder graphicsBuilder;
	IOrderPerformer orderPerformer;
	//EventPerformer eventPerformer;
	IEventPerformer performer;

	public DogfightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel, Observable observable) {
		super();
		// TODO Auto-generated constructor stub
		EventPerformer eventPerformer=new EventPerformer(orderPerformer);
		
		
		gameFrame=new GameFrame("title", performer,graphicBuilder,observable);
		graphicsBuilder=new GraphicsBuilder (null);
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	public void closeAll() {
		// TODO Auto-generated method stub
		
	}

	public GameFrame getGameFrame() {
		return gameFrame;
	}

	public void setGameFrame(GameFrame gameFrame) {
		this.gameFrame = gameFrame;
	}

	public IGraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}

	public void setGraphicsBuilder(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
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
