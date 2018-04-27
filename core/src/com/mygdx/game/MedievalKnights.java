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

public class MedievalKnights extends ApplicationAdapter {

	public SpriteBatch batch;

	int gameState = 0;

	Menu menuScreen = new Menu();
	GameScreen gameScreen = new GameScreen();

	@Override
	public void create() {
		batch = new SpriteBatch();
		if (gameState == 0)
			menuScreen.create(this);
	
			
	}

	@Override
	public void render() {
		if (gameState == 0)
			menuScreen.render(batch);
		if (gameState == 1)
			gameScreen.render(batch);
	}

	@Override
	public void dispose() {
		if (gameState == 0)
			// menuScreen.dispose();
			if (gameState == 1)
				gameScreen.dispose();
	}
<<<<<<< HEAD
=======

	public void startGame() { 
		gameScreen.create(this);
	}
>>>>>>> MedievalKnights/master
	
	public SpriteBatch getBatch() {
		return batch;
	}

	public void setBatch(SpriteBatch batch) {
		this.batch = batch;
	}
}
