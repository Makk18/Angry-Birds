package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;

public class PauseScreen implements Screen  {
    private Main game;
    private Stage stage;
    private Screen current_level;
    private SpriteBatch batch;
    private Texture background;

    private Texture resumebutton;
    private Rectangle resumebuttonRectangle;

    private Texture savegamebutton;
    private Rectangle savegamebuttonRectangle;

    private Texture exitbutton;
    private Rectangle exitbuttonRectangle;


    public PauseScreen(Main game, Screen current_level) {
        this.game = game;
        stage = new Stage();
        this.current_level = current_level;
        batch = new SpriteBatch();
        background = new Texture("pausebackground.jpg");
        resumebutton = new Texture("resumebutton.png");
        savegamebutton = new Texture("savegamebutton.png");
        exitbutton = new Texture("exitbutton1.png");
//        resumebuttonRectangle = new Rectangle(200, 300, 200, 100);
//        savegamebuttonRectangle = new Rectangle(200, 200, 200, 100);
//        exitbuttonRectangle = new Rectangle(200, 100, 200, 100);


    }

    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);

        Drawable reumed = new TextureRegionDrawable(resumebutton);
        ImageButton resumebutton = new ImageButton(reumed);
        resumebutton.setPosition(200, 300);
        resumebutton.setSize(200, 100);
        resumebutton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(current_level);
            }
        });

        Drawable savegamed = new TextureRegionDrawable(savegamebutton);
        ImageButton savegamebutton = new ImageButton(savegamed);
        savegamebutton.setPosition(200, 200);
        savegamebutton.setSize(200, 100);
        savegamebutton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                // Implement save game state logic here
                if (current_level instanceof Level1){
                    MainMenuScreen.set_current_level_state(current_level);
                    game.setScreen(new savegameScreen(game, current_level));
                }
                else if (current_level instanceof Level2){
                    MainMenuScreen.set_current_level_state(current_level);
                    game.setScreen(new savegameScreen(game, current_level));
                }
                else if (current_level instanceof Level3){
                    MainMenuScreen.set_current_level_state(current_level);
                    game.setScreen(new savegameScreen(game, current_level));
                }
            }
        });

        Drawable exitd = new TextureRegionDrawable(exitbutton);
        ImageButton exitbutton = new ImageButton(exitd);
        exitbutton.setPosition(200, 100);
        exitbutton.setSize(200, 100);
        exitbutton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new MainMenuScreen(game));
            }
        });

        stage.addActor(resumebutton);
        stage.addActor(savegamebutton);
        stage.addActor(exitbutton);
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.draw(resumebutton,resumebuttonRectangle.x,resumebuttonRectangle.y,resumebuttonRectangle.width,resumebuttonRectangle.height);
//        batch.draw(savegamebutton,savegamebuttonRectangle.x,savegamebuttonRectangle.y,savegamebuttonRectangle.width,savegamebuttonRectangle.height);
//        batch.draw(exitbutton,exitbuttonRectangle.x,exitbuttonRectangle.y,exitbuttonRectangle.width,exitbuttonRectangle.height);
        batch.end();

        stage.act(delta);
        stage.draw();

//        if(Gdx.input.isTouched()){
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
//
//            if(resumebuttonRectangle.contains(touchX, touchY)){
//                game.setScreen(current_level);
//            }else if(savegamebuttonRectangle.contains(touchX, touchY)){
//                // Implement save game state logic here
//            }else if(exitbuttonRectangle.contains(touchX, touchY)){
//                game.setScreen(new MainMenuScreen(game));
//            }
//        }
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
        // This method is called when the screen is no longer the current screen.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
        batch.dispose();
        background.dispose();
        resumebutton.dispose();
        savegamebutton.dispose();
        exitbutton.dispose();

    }
}
