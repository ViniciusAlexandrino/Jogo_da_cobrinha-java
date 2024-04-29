import javax.swing.JFrame;

public class snakeGame extends JFrame {
	
	snakeGame() {
		this.add(new GamePanel());
		this.setTitle("Cobrinha");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
