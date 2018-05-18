package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class HPbar {
	ShapeRenderer sr;
	int maxHP;
	int currentHP;
	int width = 200;
	
	final int height = 40;
	final int x = 20;
	final int y= 20;
	
	public void draw(){
		sr.begin();
		int HPP=maxHP/currentHP;
		sr.setColor(1-HPP,1*HPP,0f,0.8f);
		sr.rect(x, y, width, height);
		sr.end();
	}
}
