package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EditScreen {

	World world;
	MedievalKnights game; 
	Creator creator;
	KeyInput inputs;
	
	public void create(MedievalKnights game) {
		world = new World();
		this.game = game; 
		inputs = new KeyInput();
<<<<<<< HEAD
		creator = new Creator(10,new Texture("Creator.png"),150,150,world.getWorldX(),world.getWorldY());
		inputs.setUser(creator);
=======
		player = new Player(5,2, "John", "A Guy",new Texture("New_Piskel.png"),150,150,world.getWorldX(),world.getWorldY());
		player = new Player(100,100,"John", "A Guy",new Texture("sprites/New_Piskel.png"),150,150,world.getWorldX(),world.getWorldY());
		inputs.setPlayer(player);
>>>>>>> MedievalKnights/master
		Gdx.input.setInputProcessor(inputs);
		
		game.gameState = 2;
		System.out.println("1");
	}

	public void render (SpriteBatch batch) {
		creator.move();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		world.render(batch);
		batch.draw(creator.getImg(),creator.getX()-32,creator.getY()-32,64,64); 

		batch.setProjectionMatrix(creator.camera.combined);
		batch.end();
	}



	public void dispose () {
		game.getBatch().dispose();
	}
}
