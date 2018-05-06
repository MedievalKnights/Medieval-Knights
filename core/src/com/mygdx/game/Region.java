package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Region {
	TextureAtlas atlasBack = new TextureAtlas(Gdx.files.internal("Grass.atlas"));
	Animation<TextureRegion> background = new Animation<TextureRegion>(1f,atlasBack.getRegions());
	
	Tile[][] region = new Tile[10][10];
	public Region() {
		for(int i = 0; i < 10;i++) {
			for(int j = 0; j < 10;j++) {
				region[i][j] = new Tile(i*32,i*32,background.getKeyFrame(1f));
			}
		}
	}
	
	public void render(SpriteBatch batch) {
		for(int i = 0; i < 10;i++) {
			for(int j = 0; j < 10;j++) {
				Tile t = region[i][j];
				batch.draw(t.getTile(), t.getX(), t.getY(), 32, 32);
			}
		}
	}
}
