package jpu2016.dogfight.model;
import java.awt.Image;

public class Sky implements IArea {
	private Dimension dimension;
	private Image image;
	public Sky(Dimension dimension) {
		//image = new Image();
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		
		return image;
	}

}
