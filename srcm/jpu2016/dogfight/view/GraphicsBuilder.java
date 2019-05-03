package jpu2016.dogfight.view;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
//import jpu2016.gameframe.Graphics;
import jpu2016.gameframe.IGraphicsBuilder;
//import jpu2016.gameframe.ImageObserver;
public class GraphicsBuilder implements IGraphicsBuilder {
	IDogfightModel  dogfightModel;
	BufferedImage emptySky;
	IMobile mobile;
	
	
	public GraphicsBuilder(IDogfightModel  dogfightModel) {
		super();
		// TODO Auto-generated constructor stub
		emptySky=new BufferedImage(); 
		this.dogfightModel=dogfightModel;
		
	}
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}
	

}
