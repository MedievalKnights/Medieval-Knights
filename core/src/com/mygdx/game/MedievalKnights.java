package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GLTexture;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.Menu;

public class MedievalKnights extends ApplicationAdapter{
	
	int gameState = 0;
	
	Menu menuScreen = new Menu();
	GameScreen gameScreen = new GameScreen();
	
	@Override
	public void create() {
		if(gameState == 0)
			menuScreen.create();
		if(gameState == 1)
			gameScreen.create();
	}
	@Override
	public void render () {
		if(gameState == 0)
			menuScreen.render();
		if(gameState == 1)
			gameScreen.render();
	}
	@Override
	public void dispose () {
		if(gameState == 0)
			menuScreen.dispose();
		if(gameState == 1)
			gameScreen.dispose()	;
	}
}
