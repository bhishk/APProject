

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	public double xv, yv;
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		x+=2*dir;
		xv = 0;
		yv = 0;
	}

	public void jump() {
		int i = 3;
		while(i>-4)
		{
			y+=i;
			i--;
		}
	}

	public void act(ArrayList<Shape> obstacles) {
		yv += .5;
		y+=yv;
	}


}
