package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Player{
	int maxHP;
	int currentHP;
	int armor;
	int speed;
	int x;
	int y;
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
	}
	
	public void move(int lateral, int vertical) {
		x += lateral;
		y += vertical;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
