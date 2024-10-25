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

import java.util.Date;

public class savegameScreen implements Screen {
    private Main game;
    private Texture background;
    private SpriteBatch batch;
    private Stage stage;
    private Screen current_level;
    private Texture resumebutton;
    private Texture exitbutton;

    public savegameScreen(Main game, Screen current_level) {
            this.game = game;
            batch = new SpriteBatch();
            this.current_level = current_level;
            stage = new Stage();
            background = new Texture("gamesaved.png");
            resumebutton = new Texture("resumebutton.png");
            exitbutton = new Texture("exitbutton1.png");

        }
        @Override
        public void show () {
            Gdx.input.setInputProcessor(stage);
            Drawable exitd = new TextureRegionDrawable(exitbutton);
            ImageButton exitbutton = new ImageButton(exitd);
            exitbutton.setPosition(160, 5);
            exitbutton.setSize(150, 50);
            exitbutton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(new MainMenuScreen(game));
                }
            });
            Drawable resumed = new TextureRegionDrawable(resumebutton);
            ImageButton resumebutton = new ImageButton(resumed);
            resumebutton.setPosition(5, 5);
            resumebutton.setSize(150, 50);
            resumebutton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(current_level);
                }
            });
            stage.addActor(resumebutton);
            stage.addActor(exitbutton);

        }


        @Override
        public void render (float delta){
            ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
            batch.begin();
            batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            batch.end();

            stage.act();
            stage.draw();
        }
        @Override
        public void resize ( int width, int height){

        }

        @Override
        public void pause () {

        }

        @Override
        public void resume () {

        }

        @Override
        public void hide () {

        }

        @Override
        public void dispose () {
        background.dispose();
        stage.dispose();
        resumebutton.dispose();
        exitbutton.dispose();
    }
}
