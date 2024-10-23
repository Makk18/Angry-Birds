package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class looseScreen implements Screen {
    private Main game;
    private Texture loosebackground;
    private SpriteBatch batch;
    private float time = 4f;


    public looseScreen(Main game){
        this.game = game;
        batch = new SpriteBatch();
        loosebackground = new Texture("loosebackground.png");


    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(loosebackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();

        time -= delta;
        if (time <= 0) {
            game.setScreen(new SelectLevelScreen(game));
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
        loosebackground.dispose();

    }
}
