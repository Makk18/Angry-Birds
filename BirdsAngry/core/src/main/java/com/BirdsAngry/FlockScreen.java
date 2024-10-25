package com.BirdsAngry;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;

public class FlockScreen implements Screen{
    private Main game;
    private Stage stage;
    private SpriteBatch batch;
    private Texture backbutton;

//    private Rectangle backbuttonrectangle;
    private Texture flock;

    public FlockScreen(Main game){
        this.game = game;
        stage = new Stage();
        batch = new SpriteBatch();
        backbutton = new Texture("backbutton1.png");
//        backbuttonrectangle = new Rectangle(15, Gdx.graphics.getHeight()-50, 70, 40);
        flock = new Texture("flock.png");
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);

        Drawable backd = new TextureRegionDrawable(backbutton);
        ImageButton backbutton = new ImageButton(backd);
        backbutton.setPosition(15, Gdx.graphics.getHeight()-50);
        backbutton.setSize(70, 40);
        backbutton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new MainMenuScreen(game));
            }
        });

        stage.addActor(backbutton);

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        batch.begin();
        batch.draw(flock, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.draw(backbutton, backbuttonrectangle.x, backbuttonrectangle.y, backbuttonrectangle.width, backbuttonrectangle.height);
        batch.end();

        stage.act();
        stage.draw();

//        if ((Gdx.input.isTouched())){
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
//            if (backbuttonrectangle.contains(touchX, touchY)){
//                game.setScreen(new MainMenuScreen(game));
//            }
//        }

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
