package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** First screen of the application. Displayed after the application is created. */
public class LoadingScreen implements Screen {
    private SpriteBatch batch;
    private Texture loadingTexture;
    private Main game;
    private float time = 0;
    public LoadingScreen(Main game) {
        this.game = game;
        batch = new SpriteBatch();
        loadingTexture = new Texture("background1.png");
        time = 4f;
    }



    @Override
    public void show() {
        // Prepare your screen here.
//        batch = new SpriteBatch();
//        loadingTexture = new Texture("background123.png");
//        time = 4f;
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(loadingTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();

        time -= delta;
        if (time <= 0) {
            game.setScreen(new MainMenuScreen(game));
        }
//    while(time > 0){
//        time-=delta;
//
//        }
//        if(time <= 0){
//            game.setScreen(new MainMenuScreen(game));
//    }

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
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.

        batch.dispose();
        loadingTexture.dispose();


    }
}
