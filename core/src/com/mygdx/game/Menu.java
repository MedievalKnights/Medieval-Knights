package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class Menu {
	Stage stage;
	TextButton textButton;
	TextButton genericButton;
	TextButtonStyle buttonStyle;
	BitmapFont font;
	Skin skin;
	TextureAtlas buttonAtlas;
	SpriteBatch batch;
	Texture background;
	Pixmap pixmap;
	Texture texture;
	TextButton startButton;
	
	MedievalKnights game; 

	Pixmap backgroundMap;

	public void create(MedievalKnights game) {
		stage = new Stage();
		font = new BitmapFont();
		skin = new Skin();
		//background = new Texture("");
		this.game = game; 
		
		Gdx.input.setInputProcessor(stage);

		skin.add("default", font);
		skin.add("startbutton", new Texture("startButton.png"));

		TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();

		textButtonStyle.up = skin.newDrawable("startbutton", Color.GRAY);
		textButtonStyle.down = skin.newDrawable("startbutton", Color.DARK_GRAY);
		textButtonStyle.over = skin.newDrawable("startbutton", Color.LIGHT_GRAY);
		textButtonStyle.font = skin.getFont("default");

		skin.add("default", textButtonStyle);

		pixmap = new Pixmap((int) Gdx.graphics.getWidth() / 4, (int) Gdx.graphics.getHeight() / 10,
				Pixmap.Format.RGB888);
		pixmap.setColor(Color.BLACK);
		pixmap.fill();

		texture = new Texture(pixmap);

		startButton = new TextButton("", skin);
		startButton.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);

		stage.addActor(startButton);

	}

	public void render(SpriteBatch batch) {
		batch.begin();
		batch.draw(texture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();

		stage.act();
		stage.draw();
		
		getButtonInput(); 
	}

	public void dispose() {
		batch.dispose();
		background.dispose();

	}
	public void getButtonInput() {

		if (startButton.isPressed()) {
			System.out.println("PRESSED!");
			//gameScreen.startGame();

		if(startButton.isPressed()) {
			game.startGame();

		}
	}
	
	}
}
