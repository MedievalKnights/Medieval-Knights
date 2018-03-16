package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Menu extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	TextButtonStyle startButtonStyle; 
	TextButtonStyle helpButtonStyle; 
	TextButtonStyle exitButtonStyle; 
	
	BitmapFont startButtonFont; 
	BitmapFont helpButtonFont;
	BitmapFont exitButtonFont;
	
	TextButton startButton; 
	TextButton helpButton; 
	TextButton exitButton; 
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		//img = new Texture("badlogic.jpg");
		
		startButtonStyle = new TextButtonStyle();
		helpButtonStyle = new TextButtonStyle();
		exitButtonStyle = new TextButtonStyle();
		
		startButtonFont = new BitmapFont();
		helpButtonFont = new BitmapFont();
		exitButtonFont = new BitmapFont();
		
		startButtonStyle.font = startButtonFont; 
		helpButtonStyle.font = helpButtonFont; 
		exitButtonStyle.font = exitButtonFont; 
		
		startButton = new TextButton("Start", startButtonStyle);
		helpButton = new TextButton("Help", helpButtonStyle);
		exitButton = new TextButton("Exit", exitButtonStyle);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		startButton.setX(200);
		startButton.setY(250);
		startButton.draw(batch, 1);
		
		helpButton.setX(295);
		helpButton.setY(250);
		helpButton.draw(batch, 1);
		
		exitButton.setX(390);
		exitButton.setY(250);
		exitButton.draw(batch, 1);
		
		System.out.println(startButton.isTouchable()); 
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		//img.dispose();
	}
	
	public void getButtonInput() {
		if(startButton.isPressed()) {
			
			System.out.println("PRESSED!");
			//game.startGame();
		}
	}
}
