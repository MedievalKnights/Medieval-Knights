package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Player{
	int maxHP;
	int currentHP;
	int armor;
	double speed;
	double diagSpeed;
	double tempSpeed;
	double x;
	double y;
	boolean mUp, mDown, mLeft, mRight;
	Texture image;
	String name;
	String desc;
	KeyInput inputs;

	public Player(int MAX, int CURRENT, int ARMOR, int SPEED, String NAME, String DESC, Texture IMG, int X, int Y) {
		maxHP = MAX;
		currentHP = CURRENT;
		armor = ARMOR;
		speed = SPEED;
		name = NAME;
		desc = DESC;
		image = IMG;
		x = X;
		y = Y;
		inputs = new KeyInput();
		diagSpeed = Math.sqrt((speed*speed)/2);
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
		if((mUp == true && (mLeft == true || mRight == true))||(mDown == true && (mLeft == true || mRight == true))) {
			tempSpeed = diagSpeed;
		}
		else {
			tempSpeed = speed;
		}
		
		if(mUp == true && mDown == false) {
			y += tempSpeed;
		}
		else if(mUp == false && mDown == true){
			y -= tempSpeed;
		}
		
		if(mLeft == true && mRight == false) {
			x -= tempSpeed;
		}
		else if(mLeft == false && mRight == true){
			x += tempSpeed;
		}
	}
	
	public int getX() {
		return (int) Math.round(x);
	}
	
	public int getY() {
		return (int) Math.round(y);
	}
	
	public int getHP() {
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
	
	public Texture getImg() {
		return image;
	}
}
