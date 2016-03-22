import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public abstract class Element extends JComponent {

	private Position position;
	protected Color color;
	
	public Element(int x, int y) {
		
		position = new Position(x, y);
		color = new Color(0,0,0);
	}
	
	public Position getPosition(){
		return position;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void paint(Graphics g) {
		 g.setColor(color);
	    g.fillRect (position.getX()*Map.BLOCK_SIZE, position.getY()*Map.BLOCK_SIZE, Map.BLOCK_SIZE, Map.BLOCK_SIZE);  
	 }

}
