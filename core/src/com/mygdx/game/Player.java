package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

	int armor;
	public float currentHP = (float) 100.0;
	public float maxHP = (float) 100.0;
	public float currentSA = (float) 100.0;
	public float maxSA = (float) 100.0;
	Boolean isRunning = false;
	float speed;
	float runSpeedMultiplier;
	float diagSpeed;
	float diagSpeedMultiplier;
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
	GameScreen gs;
	HPbar hpBar;
	StaminaBar saBar;

	public void setRunning(boolean x) {
		isRunning = x;
	}

public void Running() {
		
		if (isRunning == true && currentSA>0) {
			runSpeedMultiplier= 2;
			diagSpeedMultiplier = 2;
			if (currentSA >= 0) {
				currentSA -= 0.5;
			}
		} else {
			runSpeedMultiplier= 1;
			diagSpeedMultiplier = 1;
			if (currentSA <= maxSA) {
				currentSA += 0.25;
				if(currentSA < 5) {
					isRunning=false;
				}
			}
		}
	}

	public Player(int ARMOR, int SPEED, String NAME, String DESC, Texture IMG, int X, int Y, int MaxX, int MaxY) {
		hpBar = new HPbar();
		hpBar.setPlay(this);
		saBar = new StaminaBar();
		saBar.setPlay(this);
		inputs = new KeyInput();
		inputs.setPlay(this);
		armor = ARMOR;
		speed = SPEED;
		name = NAME;
		desc = DESC;
		image = IMG;
		x = X;
		y = Y;
		maxX = MaxX;
		maxY = MaxY;
		diagSpeed = (float) Math.sqrt((speed * speed) / 2);

		camera = new OrthographicCamera(900, 900);
		camera.translate(X + 38, Y + 16);
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
			tempSpeed = diagSpeed*diagSpeedMultiplier;
		} else {
			tempSpeed = speed*runSpeedMultiplier;
		}

		if (mUp == true && mDown == false) {
			if (y < maxY) {
				y += tempSpeed;
				camera.translate(0, tempSpeed);
			}
		} else if (mUp == false && mDown == true) {
			if (y > 0) {
				y -= tempSpeed;
				camera.translate(0, -tempSpeed);
			}
		}

		if (mLeft == true && mRight == false) {
			if (x > 0) {
				x -= tempSpeed;
				camera.translate(-tempSpeed, 0);
			}
		} else if (mLeft == false && mRight == true) {
			if (x < maxX) {
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

	public float getHP() {
		return currentHP;
	}

	public void damage(int damage) {
		if (currentHP - damage < 0)
			currentHP = 0;
		else
			currentHP -= damage;
	}

	public void heal(int heal) {
		if (currentHP + heal > maxHP)
			currentHP = maxHP;
		else
			currentHP += heal;
	}

	public void render(SpriteBatch batch) {
		hpBar.draw(batch);
		saBar.draw(batch);
		Running();
	}

	public Texture getImg() {
		return image;
	}
}
