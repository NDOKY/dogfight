package jpu2016.dogfight.view;
import java.lang.Runnable;
import java.util.Observable;

import jpu2016.gameframe.GameFrame;
import jpu2016.gameframe.IEventPerformer;
//import jpu2016.gameframe.IEventperformer;
import jpu2016.gameframe.IGraphicsBuilder;

public class DogfightView implements Runnable, IViewSystem {

	private Observable observable;
	private IGraphicsBuilder graphicBuilder;
	GameFrame gameFrame;
	IGraphicsBuilder graphicsBuilder;
	IEventPerformer performer;

	public DogfightView(IEventPerformer performer) {
		super();
		// TODO Auto-generated constructor stub
		EventPerformer eventPerformer=new EventPerformer();
		
		gameFrame=new GameFrame("title", performer,graphicBuilder,observable);
		graphicsBuilder=new GraphicsBuilder (null);
		this.performer=performer;
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
	

}
