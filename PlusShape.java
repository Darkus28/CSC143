/**
 * 
 * Class to define a plus shape that inherits from AbstractShape
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.Color;
import java.awt.Graphics;

public class PlusShape extends AbstractShape {

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
	public PlusShape(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	/**
	 * Draws a plus shape using the values passed to the PlusShape class
	 * constructor
	 */
	@Override
	public void drawShape(Graphics g) {
		g.setColor(color);
		g.drawLine(x - (width / 2), y, x + (width / 2), y);
		g.drawLine(x, y - (height / 2), x, y + (height / 2));
	}

	/**
	 * Makes a deep copy of the plus shape
	 */
	@Override
	public Shape deepCopy() {
		PlusShape copy = new PlusShape(this.getX(), this.getY(), this.getWidth(), this.getHeight(), this.getColor());
		return copy;
	}

}
