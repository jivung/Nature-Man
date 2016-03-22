import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame {

	private static final Color GRASS_COLOR = new Color(133, 224, 109);

	public Game() {
		Map map = new Map();
		initUI(map.getWidth(), map.getHeigt(), map);
		map.paint(this);
	}

	private void initUI(int mapWidth, int mapHeight, Map map) {

		//JPanel panel = new JPanel();
		//getContentPane().add(panel);
		//panel.setLayout(null);
		//panel.add(map);

		setTitle("Nature Man");
		setSize(mapWidth * 50, mapHeight * 50);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(GRASS_COLOR);
		//getContentPane().add(new Character(5,5));
	}

	public static void main(String[] args) {

		Game game = new Game();
		game.setVisible(true);


	}

}
