package com.BirdsAngry;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class FlockScreen implements Screen{
    private Main game;
    private SpriteBatch batch;
    private Texture backbutton;

    private Rectangle backbuttonrectangle;
    private Texture flock;

    public FlockScreen(Main game){
        this.game = game;
        batch = new SpriteBatch();
        backbutton = new Texture("backbutton1.png");
        backbuttonrectangle = new Rectangle(15, Gdx.graphics.getHeight()-50, 70, 40);
        flock = new Texture("flock.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        batch.begin();
        batch.draw(flock, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(backbutton, backbuttonrectangle.x, backbuttonrectangle.y, backbuttonrectangle.width, backbuttonrectangle.height);
        batch.end();

        if ((Gdx.input.isTouched())){
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (backbuttonrectangle.contains(touchX, touchY)){
                game.setScreen(new MainMenuScreen(game));
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
        batch.dispose();
        backbutton.dispose();
        flock.dispose();


    }


}
