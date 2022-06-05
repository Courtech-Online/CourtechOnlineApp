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
	Font titleFont;
	Font normalFont;
	
    GraphicsDevice gDevice;
	int currentScreenWidth, currentScreenHeight;
	
	public static void main(String[] args) {

		new Game();
	}
	
	public Game(){
		
		GraphicsEnvironment gEnvironement = GraphicsEnvironment.getLocalGraphicsEnvironment();
		gDevice = gEnvironement.getDefaultScreenDevice();

		currentScreenWidth = 1600;
		currentScreenHeight = 900;

		window = new JFrame();
		window.setSize(currentScreenWidth, currentScreenHeight);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(new Color(53,52,89));
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
        createFont();
		createUIComponent();

	}
	public void createFont(){

		int titleFontSize = (int)Math.round(currentScreenWidth*0.2000);
		titleFont = new Font("Raleway, Courant", Font.PLAIN, titleFontSize);
		int titlenormalFontSize = (int)Math.round(currentScreenHeight*0.035)
	    normalFont = new Font("Time New Roman", Font.PLAIN, titlenormalFontSize);
	}
	public void createUIComponent(){
		
		//Title New Panel
		titleNamePanel = new JPanel();
		int tnp_x = (int)Math.round(currentScreenWidth*0.125);
		int tnp_y = (int)Math.round(currentScreenHeight*0.125);
		int tnp_w = (int)Math.round(currentScreenWidth*0.75);
		int tnp_h = (int)Math.round(currentScreenHeight*0.25);
		titleNamePanel.setBounds(tnp_x, tnp_y, tnp_w, tnp_h);
//      titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(new Color(53,52,89));
		titleNameLabel = new JLabel("COURTECH ONLINE");
		titleNameLabel.setForeground(new Color(132,76,199));
		titleNameLabel.setFont(titleFont);
		//Start Button
		startButtonPanel = new JPanel();
		int sbp_x = (int)Math.round(currentScreenWidth*0.375);
		int sbp_y = (int)Math.round(currentScreenHeight*0.666);
		int sbp_w = (int)Math.round(currentScreenWidth*0.25);
		int sbp_h = (int)Math.round(currentScreenHeight*0.125);
		startButtonPanel.setBounds(sbp_x, sbp_y, sbp_w, sbp_h);
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
