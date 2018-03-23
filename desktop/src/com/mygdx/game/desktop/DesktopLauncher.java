package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.mygdx.game.MedievalKnights;
import com.mygdx.game.Menu;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Medieval Knights"; 
		//config.initialBackgroundColor
		config.fullscreen = true; 
		new LwjglApplication(new MedievalKnights(), config);

	}
}
