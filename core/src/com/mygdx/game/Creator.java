package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Creator extends User{

	float speed;
	float diagSpeed;
	float tempSpeed;
	double x;
	double y;
	int maxX;
	int maxY;
	boolean mUp, mDown, mLeft, mRight;
	Texture image;
	KeyInput inputs;
	OrthographicCamera camera;

	public Creator(int SPEED, Texture IMG, int X, int Y, int MaxX, int MaxY) {
		speed = SPEED;
		image = IMG;
		x = X;
		y = Y;
		maxX = MaxX;
		maxY = MaxY;
		inputs = new KeyInput();
		diagSpeed = (float) Math.sqrt((speed * speed) / 2);

		camera = new OrthographicCamera(900, 900);
		camera.translate(X+38, Y+16);
	}

	public double getSpeed() {
		return speed;
	}

	public void setmUp(boolean mUp) {
		this.mUp = mUp;
	}

	public void setmDown(boolean mDown) {
		this.mDown = mDown;
	}

	public void setmLeft(boolean mLeft) {
		this.mLeft = mLeft;
	}

	public void setmRight(boolean mRight) {
		this.mRight = mRight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void walk() {

	}

	public void move() {
		if ((mUp == true && (mLeft == true || mRight == true))
				|| (mDown == true && (mLeft == true || mRight == true))) {
			tempSpeed = diagSpeed;
		} else {
			tempSpeed = speed;
		}

		if (mUp == true && mDown == false) {
			if(y < maxY) {
				y += tempSpeed;
				camera.translate(0, tempSpeed);
			}
		} else if (mUp == false && mDown == true) {
			if(y > 0) {
				y -= tempSpeed;
				camera.translate(0, -tempSpeed);
			}
		}

		if (mLeft == true && mRight == false) {
			if(x > 0) {
				x -= tempSpeed;
				camera.translate(-tempSpeed, 0);
			}
		} else if (mLeft == false && mRight == true) {
			if(x < maxX) {
				x += tempSpeed;
				camera.translate(tempSpeed, 0);
			}
		}
		camera.update();

	}

	public void render() {
	}

	public int getX() {
		return (int) Math.round(x);
	}

	public int getY() {
		return (int) Math.round(y);
	}
	
	public Texture getImg() {
		return image;
	}
}
