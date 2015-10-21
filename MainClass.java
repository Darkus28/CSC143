/**
 * 
 * Main class that acts as the Controller for the DrawingModel and Viewer classes
 * 
 * @author cordero.b.woods
 */

package project2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {

		// Creates the model that will be used throughout the application
		DrawingModel model = new DrawingModel();
		// Creates and adds a diamond shape to the model
		DiamondShape diamond = new DiamondShape(300, 250, 50, 50, Color.BLUE);
		model.addShape(diamond);

		// Creates the frame that the view will be added to
		JFrame frame = new JFrame("Display of shapes");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// Creates the view that will be added to the model
		Viewer view = new Viewer();
		// Adds the view to the model
		model.addView(view);
		// Updates the view with the current data from the model
		model.updateViews();
		// Creates and adds a plus shape to the model
		PlusShape plus = new PlusShape(400, 400, 50, 50, Color.BLACK);
		model.addShape(plus);
		// Updates the view with the current data from the model
		model.updateViews();
		// Adds the panel in the view to the frame
		frame.add(view.centerPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
