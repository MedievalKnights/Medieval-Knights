package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class Menu {

	SpriteBatch batch;
	Texture background;
	Player player;
	KeyInput inputs;
	
	TextButton startButton;
	TextButtonStyle buttonStyle;
	Skin skin;

	public void create() {
		batch = new SpriteBatch();
		inputs = new KeyInput();
		background = new Texture("Grass_Complete_RPG.png");
		inputs.setPlayer(player);
		buttonStyle = new TextButtonStyle();
		startButton = new TextButton("1234",skin);
		
		skin.add("1234", new Texture("ui/start.png")); 
		
		Gdx.input.setInputProcessor(inputs);
	}

	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.draw(background, 0, 0, 900, 900);
		batch.end();
	}

	public void dispose() {
		batch.dispose();
		background.dispose();
	}
}
