package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Level1 implements Screen {

    // defining attributes
    private Main game;
    private SpriteBatch batch;
    private Texture go;
    private Texture go1;
    private Texture background;
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

    public Level1(Main game){  // level Constructor
        this.game = game;
        batch = new SpriteBatch();
        go = new Texture("go.png");
        go1 = new Texture("go1.png");
        background = new Texture("level1background.png");
        pausebutton = new Texture("pausebutton.png");
        redbird = new Texture("redbird.png");
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
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(catapult,100,70,50,70);
        batch.draw(redbird,110,110,50,50);
        batch.draw(yellowbird,50,65,50,50);
        batch.draw(terence,10,65,60,60);

        int xpos = Gdx.graphics.getWidth()-300;
        int ypos = 70;


        // creating the stucture ( harcoded for each level as of now )
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

        batch.draw(go, xpos + 200, ypos-65, 40, 40);
        batch.draw(go1, 10, ypos-65, 40, 40);



        batch.end();


        if (Gdx.input.isTouched()){
            int touchX = Gdx.input.getX();
            int touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (touchX > xpos-135 && touchX < xpos-135+50 && touchY > ypos-65 && touchY < ypos-65+50){
                game.setScreen(new PauseScreen(game,this));
            }
            if (touchX > xpos + 200 && touchX < xpos + 200 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
                game.setScreen(new winScreen(game));
            }
            if (touchX > 10 && touchX < 10 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
                game.setScreen(new looseScreen(game));
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
        background.dispose();
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
