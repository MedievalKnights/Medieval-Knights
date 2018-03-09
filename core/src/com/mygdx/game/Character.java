package com.mygdx.game;

public abstract class Character {
	int maxHP;
	int currentHP;
	int armor;
	int speed;
	int movePattern;
	int x;
	int y;
	
	//Move Patterns:
	//-1: Player
	//0: Dead
	//1: Stationary NPC
	//2: Animal
	//3: Melee
	//4: Blitzer
	//5: Ranged
	//6: Turret
	//7: Scared/Avoid Player
	//8+: Custom/Special NPC
	
	String name;
	String desc;

	public Character(int MAX, int CURRENT, int ARMOR, int SPEED, int MOVE, String NAME, String DESC) {
		maxHP = MAX;
		currentHP = CURRENT;
		armor = ARMOR;
		speed = SPEED;
		movePattern = MOVE;
		name = NAME;
		desc = DESC;
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
			kill();
		else
			currentHP -= damage;
	}

	public void heal(int heal) {
		if (currentHP + heal > maxHP)
			currentHP = maxHP;
		else
			currentHP += heal;
	}
	
	public void kill() {
		movePattern = 0;
	}
}
