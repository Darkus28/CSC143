/**
 *
 * Class that provides an interface for the Main class to work with the DrawingModel class
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Viewer extends JPanel implements DrawingView {

	// The model that holds the data and methods for the shapes and views
	private DrawingModel model;
	// A panel to draw the shapes
	protected JPanel centerPanel = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Shape s : model.getShapes()) {
				s.drawShape(g);
			}
		}
	};

	/**
	 * Updates the model in the Viewer class with the given model
	 */
	@Override
	public void update(DrawingModel m) {
		// TODO Auto-generated method stub
		this.model = m;
		repaint();

	}
}
