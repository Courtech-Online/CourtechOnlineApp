import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	JButton startButton;
	Font titleFont = new Font("Raleway, Courant", Font.PLAIN, 60);
	Font normalFont = new Font("Time New Roman", Font.PLAIN, 30);
	
    GraphicsDevice gDevice;
	int currentScreenWidth, currentScreenHeight;
	
	public static void main(String[] args) {

		new Game();
	}
	
	public Game(){
		
		GraphicsEnvironment gEnvironement = GraphicsEnvironment.getLocalGraphicsEnvironment();
		gDevice = gEnvironement.getDefaultScreenDevice();

		currentScreenWidth 

		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(new Color(53,52,89));
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		int tnp_x;
		int tnp_y;
		int tnp_w;
		int tnp_h;
		titleNamePanel.setBounds(tnp_x, tnp_y, tnp_w, tnp_h);
//      titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(new Color(53,52,89));
		titleNameLabel = new JLabel("COURTECH ONLINE");
		titleNameLabel.setForeground(new Color(132,76,199));
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(new Color(53,52,89));
		
		startButton = new JButton("Learning");
		startButton.setBackground(new Color(53,52,89));
		startButton.setForeground(Color.black);
		startButton.setFont(normalFont);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);

		setFullScreen();
	}
	public void setFullScreen(){

		gDevice.setFullScreenWindow(window);
	}
}
