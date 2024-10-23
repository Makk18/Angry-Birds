package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Level3 implements Screen {
    // attributes
    private Main game;
    private SpriteBatch batch;
    private Texture backgroundTexture;
    private Texture pausebutton;
    private Texture redbird;
    private Texture yellowbird;
    private Texture terence;
    private Texture ironblock;
    private Texture woodblock;
    private Texture glassblock;
    private Texture tntblock;
    private Texture pig;
    private Texture catapult;

    public Level3(Main game) {
        this.game = game;
        batch = new SpriteBatch();
        backgroundTexture = new Texture("level3background.png");
        pausebutton = new Texture("pausebutton.png");
        redbird = new Texture("blackbird.png");
        yellowbird = new Texture("yellowbird.png");
        terence = new Texture("terence.png");
        ironblock = new Texture("ironblock.png");
        woodblock = new Texture("woodblock.png");
        glassblock = new Texture("glassblock.png");
        tntblock = new Texture("tnt.png");
        pig = new Texture("pig.png");
        catapult = new Texture("catapult.png");
    }

    @Override
    public void show() {
        // Prepare your screen here.
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
        batch.begin();
        batch.draw(backgroundTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(catapult,100,70,50,70);
        batch.draw(redbird,110,110,50,50);
        batch.draw(yellowbird,50,65,50,50);
        batch.draw(terence,10,65,60,60);

        int xpos = Gdx.graphics.getWidth()-300;
        int ypos = 70;


        // creating the stucture
        batch.draw(ironblock, xpos, ypos+140, 45, 50);
        batch.draw(ironblock, xpos+90, ypos + 140, 45, 50);
        batch.draw(ironblock, xpos, ypos + 165, 45, 50);
        batch.draw(ironblock, xpos+90, ypos + 165, 45, 50);
        batch.draw(ironblock, xpos, ypos + 190, 45, 50);
        batch.draw(ironblock, xpos+90, ypos + 190, 45, 50);
        batch.draw(ironblock, xpos+32, ypos + 190, 45, 50);
        batch.draw(ironblock, xpos+58, ypos + 190, 45, 50);
        batch.draw(glassblock, xpos+20, ypos + 215, 45, 50);
        batch.draw(glassblock, xpos+70, ypos + 215, 45, 50);
        batch.draw(woodblock, xpos+28, ypos + 255, 50, 50);
        batch.draw(woodblock, xpos+58, ypos + 255, 50, 50);
        batch.draw(pig, xpos+43, ypos + 290, 40, 40);
        batch.draw(pig, xpos+145,ypos, 70, 70);
        batch.draw(woodblock, xpos, ypos + 40, 50, 50);
        batch.draw(woodblock, xpos, ypos + 70, 50, 50);
        batch.draw(woodblock, xpos, ypos + 100, 50, 50);
        batch.draw(pig, xpos+45, ypos + 50, 50, 50);
        batch.draw(woodblock, xpos+30, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos+60, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos+90, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos + 90, ypos + 70, 50, 50);
        batch.draw(woodblock, xpos + 90, ypos + 40, 50, 50);

        // putting the pause button in the middle of the screen
        batch.draw(pausebutton,xpos-135, ypos-65, 50, 50);

        batch.draw(tntblock, xpos , ypos, 50, 50);
        batch.draw(tntblock, xpos + 50, ypos, 50, 50);
        batch.draw(tntblock, xpos +100, ypos, 50, 50);

        batch.end();


        if (Gdx.input.isTouched()){
            int touchX = Gdx.input.getX();
            int touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (touchX > xpos-135 && touchX < xpos-135+50 && touchY > ypos-65 && touchY < ypos-65+50){
                game.setScreen(new PauseScreen(game,this));
            }

        }
    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when the screen is no longer the current screen.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
        batch.dispose();
        backgroundTexture.dispose();
        pausebutton.dispose();
        redbird.dispose();
        yellowbird.dispose();
        terence.dispose();
        ironblock.dispose();
        woodblock.dispose();
        glassblock.dispose();
        tntblock.dispose();
        pig.dispose();
        catapult.dispose();
    }
}
