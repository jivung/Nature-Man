import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Map{

	private static final int MAP_WIDTH = 10;
	private static final int MAP_HEIGHT = 10;
	public static final int BLOCK_SIZE = 50;

	private Element matrix[][];

	public Map() {

		matrix = new Element[MAP_WIDTH][MAP_HEIGHT];
		addElement(new Character(0, 0));
		addElement(new Tree(5,5));

	}

	private void addElement(Element element) {

		matrix[element.getPosition().getY()][element.getPosition().getX()] = element;

	}
	
	public int getWidth(){
		return MAP_WIDTH;
	}
	
	public int getHeigt(){
		return MAP_HEIGHT;
	}

	public void paint(JFrame game) {
		for(int i=0; i < MAP_WIDTH; i++){
			for(int j=0; j < MAP_HEIGHT; j++){
				if(matrix[i][j] != null){
					System.out.println("yes");
					game.getContentPane().add(matrix[i][j]);
				}
			}
		}
	}

	public void print(){
		for(int i=0; i < MAP_WIDTH; i++){
			for(int j=0; j < MAP_HEIGHT; j++){
				if(matrix[i][j] != null){
					System.out.print("x ");
				} else{
					System.out.print("o ");
				}
			}
			System.out.println();
		}
	}

}
