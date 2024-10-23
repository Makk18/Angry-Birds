package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {
    private SpriteBatch batch;
    private Texture backgroundTexture;

    private Texture startButtonTexture;
    private Rectangle startButtonRectangle;

    private Texture loadButtonTexture;
    private Rectangle loadButtonRectangle;

    private Texture flockButtonTexture;
    private Rectangle flockButtonRectangle;

    private Texture exitButtonTexture;
    private Rectangle exitButtonRectangle;

    private Main game;

    public MainMenuScreen(Main game){
        this.game = game;
        batch = new SpriteBatch();

        backgroundTexture = new Texture("background3.png");
        startButtonTexture = new Texture("startbutton.png");
        loadButtonTexture = new Texture("loadbutton.png");
        flockButtonTexture = new Texture("flockbutton.png");
        exitButtonTexture = new Texture("exitbutton.png");

        startButtonRectangle = new Rectangle(300, 300, 200, 100);
        loadButtonRectangle = new Rectangle(300, 200, 200, 100);
        flockButtonRectangle = new Rectangle(300, 100, 200, 100);
        exitButtonRectangle = new Rectangle(300 , 0, 200, 100);

    }

    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        batch.begin();
        batch.draw(backgroundTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(startButtonTexture, startButtonRectangle.x, startButtonRectangle.y, startButtonRectangle.width, startButtonRectangle.height);
        batch.draw(loadButtonTexture, loadButtonRectangle.x, loadButtonRectangle.y, loadButtonRectangle.width, loadButtonRectangle.height);
        batch.draw(flockButtonTexture, flockButtonRectangle.x, flockButtonRectangle.y, flockButtonRectangle.width, flockButtonRectangle.height);
        batch.draw(exitButtonTexture, exitButtonRectangle.x, exitButtonRectangle.y, exitButtonRectangle.width, exitButtonRectangle.height);
        batch.end();

        if (Gdx.input.isTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();

            if (startButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new SelectLevelScreen(game));
            } else if (loadButtonRectangle.contains(touchX, touchY)) {
//                Level1 loadlLevel = loadGameState();
//                if (loadlLevel !=null){
//                    game.setScreen(loadlLevel);
//                }
                game.setScreen(new Level1(game));
            } else if (flockButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new FlockScreen(game));
            } else if (exitButtonRectangle.contains(touchX, touchY)) {
                Gdx.app.exit();
            }
        }
    }


//    private Level1 loadGameState() {
//        return new Level1(game).loadLevel1(game);
//    }

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
        backgroundTexture.dispose();
        startButtonTexture.dispose();
        loadButtonTexture.dispose();
        flockButtonTexture.dispose();
        exitButtonTexture.dispose();

    }
}
