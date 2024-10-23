package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class SelectLevelScreen implements Screen {
    private Main game;
    private SpriteBatch batch;
    private Texture backgroundTexture;

//    private Texture selectlevelButtonTexture;
//    private Rectangle selectlevelButtonRectangle;

    private Texture level1ButtonTexture;
    private Rectangle level1ButtonRectangle;

    private Texture level2ButtonTexture;
    private Rectangle level2ButtonRectangle;

    private Texture level3ButtonTexture;
    private Rectangle level3ButtonRectangle;

    private Texture backButtonTexture;
    private Rectangle backButtonRectangle;

    public SelectLevelScreen(Main game) {
        this.game = game;
        batch = new SpriteBatch();

        backgroundTexture = new Texture("background2.png");

//        selectlevelButtonTexture = new Texture("selectlevel.png");
//        selectlevelButtonRectangle = new Rectangle(300, 300, 200, 100);

        level1ButtonTexture = new Texture("level1.png");
        level1ButtonRectangle = new Rectangle(300, 300, 200, 50);

        level2ButtonTexture = new Texture("level2.png");
        level2ButtonRectangle = new Rectangle(300, 250, 200, 50);

        level3ButtonTexture = new Texture("level3.png");
        level3ButtonRectangle = new Rectangle(300, 200, 200, 50);

        backButtonTexture = new Texture("backbutton.png");
        backButtonRectangle = new Rectangle(300, 150, 200, 50);
    }

    @Override
    public void show() {
        // This method is called when this screen becomes the current screen for a Game.



    }

    @Override
    public void render(float delta) {
        // This method is called every frame to render the screen.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        batch.begin();
        batch.draw(backgroundTexture,0,0,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.draw(selectlevelButtonTexture, selectlevelButtonRectangle.x, selectlevelButtonRectangle.y, selectlevelButtonRectangle.width, selectlevelButtonRectangle.height);
        batch.draw(level1ButtonTexture, level1ButtonRectangle.x, level1ButtonRectangle.y, level1ButtonRectangle.width, level1ButtonRectangle.height);
        batch.draw(level2ButtonTexture, level2ButtonRectangle.x, level2ButtonRectangle.y, level2ButtonRectangle.width, level2ButtonRectangle.height);
        batch.draw(level3ButtonTexture, level3ButtonRectangle.x, level3ButtonRectangle.y, level3ButtonRectangle.width, level3ButtonRectangle.height);
        batch.draw(backButtonTexture, backButtonRectangle.x, backButtonRectangle.y, backButtonRectangle.width, backButtonRectangle.height);

        batch.end();

        if (Gdx.input.isTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();

            if (level1ButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new Level1(game));
            } else if (level2ButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new Level2(game));
            } else if (level3ButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new Level3(game));
            } else if (backButtonRectangle.contains(touchX, touchY)) {
                game.setScreen(new MainMenuScreen(game));
            }
        }
    }

    @Override
    public void resize(int width, int height) {
        // This method is called when the game window is resized.
    }

    @Override
    public void pause() {
        // This method is called when the game is paused.
    }

    @Override
    public void resume() {
        // This method is called when the game is resumed from a paused state.
    }

    @Override
    public void hide() {
        // This method is called when this screen is no longer the current screen for a Game.
    }

    @Override
    public void dispose() {
        // This method is called when this screen is no longer needed.
        batch.dispose();
        backgroundTexture.dispose();
//      selectlevelButtonTexture.dispose();
        level1ButtonTexture.dispose();
        level2ButtonTexture.dispose();
        level3ButtonTexture.dispose();
        backButtonTexture.dispose();

    }
}
