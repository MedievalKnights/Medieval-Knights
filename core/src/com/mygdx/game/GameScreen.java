package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen {

	World world;
	MedievalKnights game;
	Player player;
	KeyInput inputs;
	Texture background;

	public void create(MedievalKnights game) {
		world = new World();
		this.game = game;
		inputs = new KeyInput();
<<<<<<< HEAD
		player = new Player(100,100,5,2, "John", "A Guy",new Texture("New_Piskel.png"),150,150,world.getWorldX(),world.getWorldY());
		inputs.setUser(player);
		Gdx.input.setInputProcessor(inputs);
		
		game.gameState = 1;
=======
		background = new Texture("atlases/Grass.png");
		//background = new Texture("atlases/Grass_Complete_RPG.png");
		player = new Player(5, 2, "John", "A Guy", new Texture("sprites/New_Piskel.png"), 150, 150, world.getWorldX(),
				world.getWorldY());
		// player = new Player(100, 100, 100, 100, 5, 2, "John", "A Guy", new
		// Texture("New_Piskel.png"), 150, 150, world.getWorldX(), world.getWorldY());

		inputs.setPlayer(player);
		Gdx.input.setInputProcessor(inputs);

		game.gameState++;
>>>>>>> MedievalKnights/master
	}

	public void render(SpriteBatch batch) {
		player.move();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		world.render(batch);
		player.render(batch);
		batch.draw(player.getImg(), player.getX() - 32, player.getY() - 32, 64, 64);

		batch.setProjectionMatrix(player.camera.combined);
		batch.end();
	}

	public void dispose() {
		game.getBatch().dispose();
	}
}
