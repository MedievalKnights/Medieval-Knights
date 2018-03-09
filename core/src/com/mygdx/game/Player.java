package com.mygdx.game;

public class Player extends Character{
	int maxHP;
	int currentHP;
	int armor;
	int speed;
	int movePattern;
	int x;
	int y;
	public Player(int MAX, int CURRENT, int ARMOR, int SPEED, int MOVE, String NAME, String DESC) {
		super(MAX, CURRENT, ARMOR, SPEED, MOVE, NAME, DESC);
	}

}
