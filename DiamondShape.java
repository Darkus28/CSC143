/**
 * 
 * Class to define a diamond shape that inherits from AbstractShape
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class DiamondShape extends AbstractShape {

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
	public DiamondShape(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	/**
	 * Draws a diamond shape using the values passed to the DiamondShape class
	 * constructor
	 */
	@Override
	public void drawShape(Graphics g) {
		g.setColor(color);
		Polygon diamond = new Polygon();
		diamond.addPoint(x, y - (height / 2));
		diamond.addPoint(x + (width / 2), y);
		diamond.addPoint(x, y + (height / 2));
		diamond.addPoint(x - (width / 2), y);
		diamond.addPoint(x, y - (height / 2));
		g.fillPolygon(diamond);
	}

	/**
	 * Makes a deep copy of the diamond shape
	 */
	@Override
	public Shape deepCopy() {
		DiamondShape copy = new DiamondShape(this.getX(), this.getY(), this.getWidth(), this.getHeight(),
				this.getColor());
		return copy;
	}

}
