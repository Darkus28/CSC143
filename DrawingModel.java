/**
 * 
 * Class that holds the data related to the shapes and views and provides methods to work with this data
 * 
 * @author cordero.b.woods
 */
package project2;

import java.util.ArrayList;
import java.util.List;

public class DrawingModel {
	
	//Array list to hold shapes
	protected List<Shape> shapes = new ArrayList<Shape>();
	//Array list to hold views
	protected List<DrawingView> views = new ArrayList<DrawingView>();

	/**
	 * Adds a shape to the shapes array list
	 */
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	/**
	 * Updates all of the views connected to the model
	 */
	public void updateViews() {
		for (DrawingView view : views) {
			view.update(this);
		}
	}

	/**
	 * Adds a new view to the model
	 */
	public void addView(DrawingView view) {
		views.add(view);
		view.update(this);
	}

	/**
	 * Returns a deep copy of the array list of shapes
	 */
	public List<Shape> getShapes() {
		List<Shape> copy = new ArrayList<Shape>();
		for (Shape s : shapes) {
			copy.add(s.deepCopy());
		}
		return copy;
	}

}
