package com.mygdx.gameObjects;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player {
	BitmapFont font;
	TextureAtlas knightIdleAtlas;
	TextureAtlas knightWalkAtlas;
	TextureAtlas knightSlashAtlas;
	TextureAtlas knightBlockAtlas;
	TextureAtlas knightDeathAtlas;
	Animation<TextureRegion> knightIdleAnim;
	Animation<TextureRegion> knightWalkAnim;
	Animation<TextureRegion> knightRunAnim;
	Animation<TextureRegion> knightSlashAnim;
	Animation<TextureRegion> knightBlockAnim;
	Animation<TextureRegion> knightDeathAnim;
}
