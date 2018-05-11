package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World {
	Region[][] world = new Region[1][1];
	public World() {
		world[0][0] = new Region();
	}
	public void render(SpriteBatch batch) {
		for(int i = 0; i < 1;i++) {
			for(int j = 0; j < 1;j++) {
				world[i][j].render(batch);
			}
		}
	}
}
