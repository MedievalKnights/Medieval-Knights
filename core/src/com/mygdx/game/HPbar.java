package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class HPbar {
	ShapeRenderer sr = new ShapeRenderer();
	int maxHP;
	int currentHP;
	int width = 200;	
	final int height = 40;
	
	public void draw(SpriteBatch batch){
		batch.end();
		System.out.println("Hallo");
		sr.begin(ShapeType.Filled);
		int x = Gdx.graphics.getWidth()/2;
		int y = Gdx.graphics.getHeight()/2;
		int HPP=maxHP/currentHP;
		sr.setColor(1-HPP,1*HPP,0f,0.8f);
		sr.rect(15-x, y-80, width, height);
		sr.end();
		batch.begin();
	}
}
