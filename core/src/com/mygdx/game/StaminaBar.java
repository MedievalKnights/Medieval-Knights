package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class StaminaBar {
	ShapeRenderer sr = new ShapeRenderer();
	Player player;
	int width = 200;	
	final int height = 20;
	
	public void setPlay(Player play) {
		player=play;
	}
	public void draw(SpriteBatch batch){
		batch.end();
		sr.begin(ShapeType.Filled);
		int x = Gdx.graphics.getWidth()/2;
		int y = Gdx.graphics.getHeight()/2;
		sr.setColor(0f,0f,255f,0.8f);
		sr.rect(50, 800, player.currentSA*2, height);
		sr.end();
		batch.begin();
	}
}
