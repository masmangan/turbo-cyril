package lp2.textil;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class Planner {

	private Box area;
	private List<Shape> cuts;
	private String material;
	
	public Planner(String material, int width, int height) {
		this.material = material;
		area = new Box(width, height);
		cuts = new ArrayList<Shape>();
	}

	public double getUnusedArea() {
		// FIXME: subtract cuts
		return area.getArea();
	}

	public void cut(Shape s) {
		// FIXME: check position and size
		cuts.add(s);
	}

	public String getMaterial() {
		return material;
	}

}
