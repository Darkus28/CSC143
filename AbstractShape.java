/**
 * 
 * General shape class that all shapes will inherit from, with basic 
 * instance fields that all shapes will need
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.Color;

public abstract class AbstractShape implements Shape {

	// location of the center of the shape
	protected int x;
	protected int y;
	// size of the shape
	protected int width;
	protected int height;
	// color of the shape
	protected Color color;

	/**
	 * 
	 * @param x
	 *            The x-coordinate for the center of the shape
	 * @param y
	 *            The y-coordinate for the center of the shape
	 * @param width
	 *            The width of the shape
	 * @param height
	 *            The height of the shape
	 * @param color
	 *            The color of the shape
	 */
	public AbstractShape(int x, int y, int width, int height, Color color) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
