package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
<<<<<<< HEAD
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
<<<<<<< Updated upstream
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

=======
=======
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
>>>>>>> MedievalKnights/master
>>>>>>> Stashed changes

public class Player {

	int armor;
	public float currentHP = (float) 100.0;
	public float maxHP = (float) 100.0;
	public float currentSA = (float) 100.0;
	public float maxSA = (float) 100.0;
	Boolean isRunning = false;
	float speed;
	float runSpeedMultiplier;
	float diagSpeed;
	float diagSpeedMultiplier;
	float tempSpeed;
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
>>>>>>> Stashed changes
	float elapsedTime = 0;
	float x;
	float y;
	int maxX;
	int maxY;
	String anim = "walkingSouth";
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
	double x;
	double y;
	int maxX;
	int maxY;
<<<<<<< Updated upstream
=======
>>>>>>> MedievalKnights/master
>>>>>>> Stashed changes
	boolean mUp, mDown, mLeft, mRight;
	Texture image;
	String name;
	String desc;
	KeyInput inputs;
	OrthographicCamera camera;
	GameScreen gs;
	HPbar hpBar;
	StaminaBar saBar;
<<<<<<< HEAD
	TextureAtlas walkNorthAtlas;
	TextureAtlas walkSouthAtlas;
	Animation<TextureRegion> walkNorthAnimation;
	Animation<TextureRegion> walkSouthAnimation;
	public void setRunning(boolean x) {
		isRunning = x;
	}
	
	public void Running() {
		
		if (isRunning == true) {
			runSpeedMultiplier= 2;
			diagSpeedMultiplier = 2;
			if (currentSA >= 0) {
				currentSA -= 0.5;
			}
		} else {
			runSpeedMultiplier= 1;
			diagSpeedMultiplier = 1;
			if (currentSA <= maxSA) {
				currentSA += 0.25;
			}
		}
	}

	public Player(int ARMOR, int SPEED, String NAME, String DESC, Texture IMG, int X, int Y, int MaxX, int MaxY) {
		walkNorthAtlas = new TextureAtlas(Gdx.files.internal("sprites/knight-walk-north.atlas"));
		walkSouthAtlas = new TextureAtlas(Gdx.files.internal("sprites/knight-walk-south.atlas"));
		walkNorthAnimation = new Animation<TextureRegion>(1 / 3f, walkNorthAtlas.getRegions());
		walkSouthAnimation = new Animation<TextureRegion>(1 / 3f, walkSouthAtlas.getRegions());
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes

	public void setRunning(boolean x) {
		isRunning = x;
	}

	public void Running() {
		
		if (isRunning == true && currentSA>0) {
			runSpeedMultiplier= 2;
			diagSpeedMultiplier = 2;
			if (currentSA >= 0) {
				currentSA -= 0.5;
			}
		} else {
			runSpeedMultiplier= 1;
			diagSpeedMultiplier = 1;
			if (currentSA <= maxSA) {
				currentSA += 0.25;
				if(currentSA < 5) {
					isRunning=false;
				}
			}
		}
	}
	
	public void damage(float damage) {
		if (currentHP - damage < 0)
			currentHP = 0;
		
		else
			currentHP -= damage;
	}

	public void heal(float heal) {
		if (currentHP + heal > maxHP)
			currentHP = maxHP;
		else
			currentHP += heal;
	}
	
	public Player(int ARMOR, int SPEED, String NAME, String DESC, Texture IMG, int X, int Y, int MaxX, int MaxY) {
<<<<<<< Updated upstream
=======
>>>>>>> MedievalKnights/master
>>>>>>> Stashed changes
		hpBar = new HPbar();
		hpBar.setPlay(this);
		saBar = new StaminaBar();
		saBar.setPlay(this);
		inputs = new KeyInput();
		inputs.setPlay(this);
		armor = ARMOR;
		speed = SPEED;
		name = NAME;
		desc = DESC;
		image = IMG;
		x = X;
		y = Y;
		maxX = MaxX;
		maxY = MaxY;
		diagSpeed = (float) Math.sqrt((speed * speed) / 2);

		camera = new OrthographicCamera(900, 900);
		camera.translate(X + 38, Y + 16);
<<<<<<< HEAD
	}
	public TextureRegion getAnimation() {
		elapsedTime += Gdx.graphics.getDeltaTime();
		TextureRegion ret;
		if (anim.equals("walkingNorth")) {
			ret = walkNorthAnimation.getKeyFrame(elapsedTime, true);
		}
		else if (anim.equals("walkingSouth")) {
			ret = walkSouthAnimation.getKeyFrame(elapsedTime, true);
		}
		else {
			ret = walkNorthAnimation.getKeyFrame(elapsedTime, true);
		}
		return ret;
		
	}
	public void setAnim(String a) {
		anim = a;
=======
>>>>>>> MedievalKnights/master
	}
	public double getSpeed() {
		return speed;
	}

	public void setmUp(boolean mUp) {
		this.mUp = mUp;
	}

	public void setmDown(boolean mDown) {
		this.mDown = mDown;
	}

	public void setmLeft(boolean mLeft) {
		this.mLeft = mLeft;
	}

	public void setmRight(boolean mRight) {
		this.mRight = mRight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void walk() {

	}

	public void move() {
		if ((mUp == true && (mLeft == true || mRight == true))
				|| (mDown == true && (mLeft == true || mRight == true))) {
			tempSpeed = diagSpeed*diagSpeedMultiplier;
		} else {
			tempSpeed = speed*runSpeedMultiplier;
		}

		if (mUp == true && mDown == false) {
			if (y < maxY) {
				y += tempSpeed;
				camera.translate(0, tempSpeed);
			}
		} else if (mUp == false && mDown == true) {
			if (y > 0) {
				y -= tempSpeed;
				camera.translate(0, -tempSpeed);
			}
		}

		if (mLeft == true && mRight == false) {
			if (x > 0) {
				x -= tempSpeed;
				camera.translate(-tempSpeed, 0);
			}
		} else if (mLeft == false && mRight == true) {
			if (x < maxX) {
				x += tempSpeed;
				camera.translate(tempSpeed, 0);
			}
		}
		camera.update();

	}

	public int getX() {
		return (int) Math.round(x);
	}

	public int getY() {
		return (int) Math.round(y);
	}

	public float getHP() {
		return currentHP;
	}

	public void render(SpriteBatch batch) {
		hpBar.draw(batch);
		saBar.draw(batch);
		Running();
	}

	public void render(SpriteBatch batch) {
		hpBar.draw(batch);
		saBar.draw(batch);
		batch.draw(getAnimation(), x, y , 64, 64);
		Running();
	}

	public Texture getImg() {
		return image;
	}
}
