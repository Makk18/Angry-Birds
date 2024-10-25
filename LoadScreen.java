package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

public class LoadScreen implements Screen {
    private Main game;
    private float time = 3f;
    private Stage stage;
    private SpriteBatch batch;
    private Texture loadScreen;
    public LoadScreen(Main game) {
        this.game = game;
        stage = new Stage();
        batch = new SpriteBatch();
        loadScreen = new Texture("nosavegame.png");
    }
    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);


    }
    @Override
    public void render(float delta) {
        // In your render method
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
        batch.begin();
        batch.draw(loadScreen, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();
        time -= delta;
        if (time <= 0) {
            game.setScreen(new MainMenuScreen(game));
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
        loadScreen.dispose();
        batch.dispose();



    }
}
