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
	Menu startMenu; 
	SpriteBatch batch;
	BitmapFont font;
	Texture img;
<<<<<<< HEAD
	
	public static void main(String[] args) {
		
	}
	

//	public void createRectangle() {
//		Texture texture;
//		batch = new SpriteBatch();
//		batch.begin();
//		batch.draw(rect, 30, 30);
//		batch.end();
//	}
	
=======

>>>>>>> MedievalKnights/master
	@Override
	public void create() {
		startMenu = new Menu();
		batch = new SpriteBatch(); 
		font = new BitmapFont(); 
		
		startMenu.create(this);
	}

	@Override
	public void render() {
		Gdx.graphics.setTitle("FPS : " + Gdx.graphics.getFramesPerSecond());
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		startMenu.render(batch);
		batch.end();
	}

	@Override
	public void dispose() {
	
	}

	public void startGame() {
		
	}
}
