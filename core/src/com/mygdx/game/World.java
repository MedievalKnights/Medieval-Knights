package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World {
	int worldLength = 3;
	int worldWidth = 3;
	Region[][] world = new Region[worldLength][worldWidth];
	public World() {
		for (int i = 0; i < worldLength; i++) {
			for (int j = 0; j < worldWidth; j++) {
				world[i][j] = new Region(512*i,512*j);
			}
		}
		
	}
	public void render(SpriteBatch batch) {
		for(int i = 0; i < worldLength;i++) {
			for(int j = 0; j < worldWidth;j++) {
				world[i][j].render(batch);
			}
		}
	}
}
