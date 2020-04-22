package module3;
import processing.core.*;

public class MyPApplet extends PApplet {
	private String URL = "https://www.lajolla.com/wp-content/uploads/2016/11/Screen-Shot-2018-07-30-at-12.09.57-PM.png";
	private PImage backgroundImg;
	
	public void setup() {
		size(400, 400);
		backgroundImg = loadImage(URL, "png");
		stroke(0);
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
	}
	
	public void draw() {
		int [] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(3*width/4, height/8, width/4, height/5);
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30 - seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
	};
	
	public static void mian(String[] args) {
		
	}
};
