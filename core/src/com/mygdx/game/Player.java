package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

	int armor;
	float speed;
	float diagSpeed;
	float tempSpeed;
	double x;
	double y;
	int maxX;
	int maxY;
	boolean mUp, mDown, mLeft, mRight;
	Texture image;
	String name;
	String desc;
	KeyInput inputs;
	OrthographicCamera camera;
	HPbar hpBar;

	public Player(int MAX, int CURRENT, int ARMOR, int SPEED, String NAME, String DESC, Texture IMG, int X, int Y, int MaxX, int MaxY) {
		hpBar = new HPbar();
		hpBar.maxHP = MAX;
		hpBar.currentHP = CURRENT;
		armor = ARMOR;
		speed = SPEED;
		name = NAME;
		desc = DESC;
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

	public int getX() {
		return (int) Math.round(x);
	}

	public int getY() {
		return (int) Math.round(y);
	}

	public int getHP() {
		return hpBar.currentHP;
	}

	public void damage(int damage) {
		if (hpBar.currentHP - damage < 0)
			hpBar.currentHP = 0;
		else
			hpBar.currentHP -= damage;
	}

	public void heal(int heal) {
		if (hpBar.currentHP + heal > hpBar.maxHP)
			hpBar.currentHP = hpBar.maxHP;
		else
			hpBar.currentHP += heal;
	}
	public void render (SpriteBatch batch) {
		hpBar.draw(batch);
	}
	

	public Texture getImg() {
		return image;
	}
}
