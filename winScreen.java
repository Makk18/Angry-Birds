package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class winScreen implements Screen{
    private Main game;
    private Texture winbackground;
    private Texture nextbutton;
    private Texture exitbutton;
    private SpriteBatch batch;


    public winScreen(Main game){
        this.game = game;
        batch = new SpriteBatch();
        winbackground = new Texture("winbackground.png");
        nextbutton = new Texture("nextbutton.png");
        exitbutton = new Texture("exitbutton1.png");
    }
    public void show(){
    }
    public void render(float delta){
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(winbackground, 0,0,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(exitbutton,100,30,150,50);
        batch.draw(nextbutton,600,30,150,50);
        batch.end();

        if(Gdx.input.isTouched()){
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (touchX >= 100 && touchX <= 250 && touchY >= 30 && touchY <= 80){
                game.setScreen(new MainMenuScreen(game));
            }
            if (touchX >= 600 && touchX <= 750 && touchY >= 30 && touchY <= 80){
                game.setScreen(new Level2(game));
            }

        }






    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        winbackground.dispose();
        nextbutton.dispose();
        exitbutton.dispose();
    }
}
