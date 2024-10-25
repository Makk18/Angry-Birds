package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;

import java.security.PrivateKey;

public class Level1 implements Screen{

    // defining attributes
    private Main game;
    private SpriteBatch batch;
    private Texture go;
    private Texture go1;
    private Texture background;
    private Texture pausebutton;
//    private Texture redbird;
//    private Texture yellowbird;
//    private Texture terence;
    private Texture ironblock;
    private Texture woodblock;
    private Texture glassblock;
    private Texture tntblock;
//    private Texture pig;
    private Texture catapult;
    private Stage stage;

    public Level1(Main game){
        // level Constructor
        this.game = game;
        stage = new Stage();
        batch = new SpriteBatch();
        go = new Texture("go1.png");
        go1 = new Texture("go.png");
        background = new Texture("level1background.png");
        pausebutton = new Texture("pausebutton.png");

        //        redbird = new Texture("redbird.png");
//        yellowbird = new Texture("yellowbird.png");
//        terence = new Texture("terence.png");
        ironblock = new Texture("ironblock.png");
        woodblock = new Texture("woodblock.png");
        glassblock = new Texture("glassblock.png");
        tntblock = new Texture("tnt.png");
//        pig = new Texture("pig.png");
        catapult = new Texture("catapult.png");
    }



    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);

        Drawable god= new TextureRegionDrawable(go);
        ImageButton goButton = new ImageButton(god);
        goButton.setPosition(10, 10);
        goButton.setSize(40,40);
        goButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new looseScreen(game));
            }
        });

        Drawable go1d= new TextureRegionDrawable(go1);
        ImageButton go1Button = new ImageButton(go1d);
        go1Button.setPosition(740, 10);
        go1Button.setSize(40,40);
        go1Button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new winScreen(game, Level1.this));
            }
        });

        Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
        ImageButton pauseButton = new ImageButton(pausebuttond);
        pauseButton.setPosition(370, 5);
        pauseButton.setSize(60,60);
        pauseButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new PauseScreen(game, Level1.this));
            }
        });

        stage.addActor(goButton);
        stage.addActor(go1Button);
        stage.addActor(pauseButton);

    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
        redbird redbird1 = new redbird("Red", 110, 110,50,50, 50);
        yellowbird yellowbird1 = new yellowbird("Yellow", 50, 65, 50, 50, 50);
        terence terence1 = new terence("Terence", 10, 65, 40, 60, 60);
        pig pig1 = new pig(43, 290, 40, 40);
        pig pig2 = new pig(145, 70, 70, 70);
        pig pig3 = new pig(45, 50, 50, 50);
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(catapult,100,70,50,70);
        batch.draw(redbird1.getBirdTexture(),redbird1.getPosx(),redbird1.getPosy(),redbird1.getWidth(),redbird1.getHeight());
        batch.draw(yellowbird1.getBirdTexture(),yellowbird1.getPosx(),yellowbird1.getPosy(),yellowbird1.getWidth(),yellowbird1.getHeight());
        batch.draw(terence1.getBirdTexture(),terence1.getPosx(),terence1.getPosy(),terence1.getWidth(),terence1.getHeight());

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
        batch.draw(pig1.getPigTexture(), xpos+pig1.getPosx(), ypos + pig1.getPosy(), pig1.getWidth(), pig1.getHeight());
        batch.draw(pig2.getPigTexture(), xpos+pig2.getPosx(),pig2.getPosy(), pig2.getWidth(), pig2.getHeight());
        batch.draw(woodblock, xpos, ypos + 40, 50, 50);
        batch.draw(woodblock, xpos, ypos + 70, 50, 50);
        batch.draw(woodblock, xpos, ypos + 100, 50, 50);
        batch.draw(pig3.getPigTexture(), xpos+pig3.getPosx(), ypos + pig3.getPosy(), pig3.getWidth(), pig3.getHeight());
        batch.draw(woodblock, xpos+30, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos+60, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos+90, ypos + 100, 50, 50);
        batch.draw(woodblock, xpos + 90, ypos + 70, 50, 50);
        batch.draw(woodblock, xpos + 90, ypos + 40, 50, 50);

        // putting the pause button in the middle of the screen
//        batch.draw(pausebutton,xpos-135, ypos-65, 50, 50);

        batch.draw(tntblock, xpos , ypos, 50, 50);
        batch.draw(tntblock, xpos + 50, ypos, 50, 50);
        batch.draw(tntblock, xpos +100, ypos, 50, 50);

//        batch.draw(go, xpos + 200, ypos-65, 40, 40);
//        batch.draw(go1, 10, ypos-65, 40, 40);



        batch.end();

        stage.act(delta);
        stage.draw();









//        if (Gdx.input.isTouched()){
//            int touchX = Gdx.input.getX();
//            int touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
//            if (touchX > xpos-135 && touchX < xpos-135+50 && touchY > ypos-65 && touchY < ypos-65+50){
//                game.setScreen(new PauseScreen(game,this));
//            }
//            if (touchX > xpos + 200 && touchX < xpos + 200 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
//                game.setScreen(new winScreen(game));
//            }
//            if (touchX > 10 && touchX < 10 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
//                game.setScreen(new looseScreen(game));
//            }
//        }


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
//        pausebutton.dispose();
//        redbird.dispose();
//        yellowbird.dispose();
//        terence.dispose();
        ironblock.dispose();
        woodblock.dispose();
        glassblock.dispose();
        tntblock.dispose();
//        pig.dispose();
        catapult.dispose();
    }



}
