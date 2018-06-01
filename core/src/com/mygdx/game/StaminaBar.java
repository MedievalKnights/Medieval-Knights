package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class StaminaBar {
	ShapeRenderer sr = new ShapeRenderer();
	int maxStamina;
	int currentStamina;
	int width = 200;	
	final int height = 40;
	public void draw(SpriteBatch batch){
		batch.end();
		sr.begin(ShapeType.Filled);
		int x = Gdx.graphics.getWidth()/2;
		int y = Gdx.graphics.getHeight()/2;
		int SPP= maxStamina/currentStamina;
		sr.setColor(1-SPP,1*SPP,0f,0.8f);
		sr.rect(50, 625, width, height);
		sr.end();
		batch.begin();
	}
}
