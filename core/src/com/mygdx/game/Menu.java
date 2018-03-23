package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Menu {
	MedievalKnights gameScreen;
	Stage stage;
	BitmapFont font;
	Skin skin;

	TextButton startButton;

	String startButtonText;

	public void create(MedievalKnights gameScreen) {
		gameScreen = gameScreen;
		
		stage = new Stage();
		font = new BitmapFont();
		skin = new Skin();
		
		startButtonText = "Start";
		
		Gdx.input.setInputProcessor(stage);
		mainMenuButtons(startButtonText);
		// img = new Texture("badlogic.jpg");

	}

	public void mainMenuButtons(String buttonName) {
		skin.add("default", font);

		// Create a texture
		Pixmap pixmap = new Pixmap((int) Gdx.graphics.getWidth() / 4, (int) Gdx.graphics.getHeight() / 10,
				Pixmap.Format.RGB888);
		pixmap.setColor(Color.WHITE);
		pixmap.fill();
		skin.add("background", new Texture(pixmap));
		// skin.add("default", font);

		// Create a button style
		TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("background", Color.GRAY);
		textButtonStyle.down = skin.newDrawable("background", Color.DARK_GRAY);
		// textButtonStyle.checked = skin.newDrawable("background", Color.DARK_GRAY);
		textButtonStyle.over = skin.newDrawable("background", Color.LIGHT_GRAY);
		textButtonStyle.font = skin.getFont("default");
		skin.add("default", textButtonStyle);

		startButton = new TextButton(buttonName, skin); // Use the initialized skin
		startButton.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8,
				Gdx.graphics.getHeight() / 2);
		stage.addActor(startButton);

	}

	public void render(SpriteBatch batch) {
		stage.act();
		stage.draw();
		getButtonInput();
	}

	public void getButtonInput() {
		if (startButton.isPressed()) {
			System.out.println("PRESSED!");
			gameScreen.startGame();
		}
	}
}
