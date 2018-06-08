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
	EditScreen editScreen = new EditScreen();


	@Override
	public void create() {
		batch = new SpriteBatch();
		if (gameState == 0)
			menuScreen.create(this);
			SoundHandler.init();
			
	}

	@Override
	public void render() {
		if (gameState == 0)
			menuScreen.render(batch);
		if (gameState == 1)
			gameScreen.render(batch);
		if (gameState == 2)
			editScreen.render(batch);
	}

	@Override
	public void dispose() {
	}


	public void startGame() { 
		gameScreen.create(this);
		SoundHandler.stopMainMenuMusic();
	}

	public void startEdit() {
		editScreen.create(this);
		SoundHandler.stopMainMenuMusic();
	}
	
	public SpriteBatch getBatch() {
		return batch;
	}

	public void setBatch(SpriteBatch batch) {
		this.batch = batch;
	}
}
