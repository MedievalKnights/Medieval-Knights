package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen {

	SpriteBatch batch;
	Texture background;
	Player player;
	KeyInput inputs;
	
	public void create() {
		batch = new SpriteBatch();
		inputs = new KeyInput();
		background = new Texture("Grass_Complete_RPG.png");
		player = new Player(15,15,5,2, "John", "A Guy",new Texture("New_Piskel.png"),15,15);
		inputs.setPlayer(player);
		Gdx.input.setInputProcessor(inputs);
	}

	public void render () {
		player.move();
		Gdx.gl.glClearColor(1, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(background,0,0,900,900);
		batch.draw(player.getImg(),player.getX(),player.getY(),96,96);
		batch.end();
	}

	public void dispose () {
		batch.dispose();
		background.dispose();	
	}
}
