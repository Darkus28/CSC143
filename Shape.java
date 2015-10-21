/**
 * 
 * A interface to hold general shape method signatures that all 
 * shapes will need
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.Graphics;

public interface Shape {

	public void drawShape(Graphics g);

	public Shape deepCopy();
}
