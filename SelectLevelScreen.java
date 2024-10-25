package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;

public class SelectLevelScreen implements Screen {
    private Main game;
    private Stage stage;
    private SpriteBatch batch;
    private Texture backgroundTexture;

//    private Texture selectlevelButtonTexture;
//    private Rectangle selectlevelButtonRectangle;

    private Texture level1ButtonTexture;
//    private Rectangle level1ButtonRectangle;

    private Texture level2ButtonTexture;
//    private Rectangle level2ButtonRectangle;

    private Texture level3ButtonTexture;
//    private Rectangle level3ButtonRectangle;

    private Texture backButtonTexture;
//    private Rectangle backButtonRectangle;

    public SelectLevelScreen(Main game) {
        this.game = game;
        batch = new SpriteBatch();
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        backgroundTexture = new Texture("background2.png");

//        selectlevelButtonTexture = new Texture("selectlevel.png");
//        selectlevelButtonRectangle = new Rectangle(300, 300, 200, 100);

        level1ButtonTexture = new Texture("level1.png");
//        level1ButtonRectangle = new Rectangle(300, 300, 200, 50);
        Drawable level1d = new TextureRegionDrawable(level1ButtonTexture);
        ImageButton level1Button = new ImageButton(level1d);
        level1Button.setPosition(250, 370);
        level1Button.setSize(300, 70);
        level1Button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener(){
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y){
                game.setScreen(new Level1(game));
            }
        });


        level2ButtonTexture = new Texture("level2.png");
//        level2ButtonRectangle = new Rectangle(300, 250, 200, 50);
        Drawable level2d = new TextureRegionDrawable(level2ButtonTexture);
        ImageButton level2Button = new ImageButton(level2d);
        level2Button.setPosition(250, 270);
        level2Button.setSize(300, 70);
        level2Button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener(){
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y){
                game.setScreen(new Level2(game));
            }
        });


        level3ButtonTexture = new Texture("level3.png");
//        level3ButtonRectangle = new Rectangle(300, 200, 200, 50);
        Drawable level3d = new TextureRegionDrawable(level3ButtonTexture);
        ImageButton level3Button = new ImageButton(level3d);
        level3Button.setPosition(250, 170);
        level3Button.setSize(300, 70);
        level3Button.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener(){
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y){
                game.setScreen(new Level3(game));
            }
        });

        backButtonTexture = new Texture("backbutton.png");
//        backButtonRectangle = new Rectangle(300, 150, 200, 50);
        Drawable backd = new TextureRegionDrawable(backButtonTexture);
        ImageButton backButton = new ImageButton(backd);
        backButton.setPosition(250, 70);
        backButton.setSize(300, 70);
        backButton.addListener(new com.badlogic.gdx.scenes.scene2d.utils.ClickListener(){
            @Override
            public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y){
                game.setScreen(new MainMenuScreen(game));
            }
        });

        stage.addActor(level1Button);
        stage.addActor(level2Button);
        stage.addActor(level3Button);
        stage.addActor(backButton);
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
//        batch.draw(level1ButtonTexture, level1ButtonRectangle.x, level1ButtonRectangle.y, level1ButtonRectangle.width, level1ButtonRectangle.height);
//        batch.draw(level2ButtonTexture, level2ButtonRectangle.x, level2ButtonRectangle.y, level2ButtonRectangle.width, level2ButtonRectangle.height);
//        batch.draw(level3ButtonTexture, level3ButtonRectangle.x, level3ButtonRectangle.y, level3ButtonRectangle.width, level3ButtonRectangle.height);
//        batch.draw(backButtonTexture, backButtonRectangle.x, backButtonRectangle.y, backButtonRectangle.width, backButtonRectangle.height);

        batch.end();

//        if (Gdx.input.isTouched()) {
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
//
//            if (level1ButtonRectangle.contains(touchX, touchY)) {
//                game.setScreen(new Level1(game));
//            } else if (level2ButtonRectangle.contains(touchX, touchY)) {
//                game.setScreen(new Level2(game));
//            } else if (level3ButtonRectangle.contains(touchX, touchY)) {
//                game.setScreen(new Level3(game));
//            } else if (backButtonRectangle.contains(touchX, touchY)) {
//                game.setScreen(new MainMenuScreen(game));
//            }
//        }
        stage.act(delta);
        stage.draw();
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
