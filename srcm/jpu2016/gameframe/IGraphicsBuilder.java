package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	public int getGlobalWidth();
	public int getGlobalHeight();
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);

}
