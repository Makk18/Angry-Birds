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

public class winScreen implements Screen{
    private Main game;
    private Screen current_level;
    private Stage stage;
    private Texture winbackground;
    private Texture nextbutton;
    private Texture exitbutton;
    private SpriteBatch batch;


    public winScreen(Main game,Screen current_level){
        this.game = game;
        stage = new Stage();
        this.current_level = current_level;
        batch = new SpriteBatch();
        winbackground = new Texture("winbackground.png");
        nextbutton = new Texture("nextbutton.png");
        exitbutton = new Texture("exitbutton1.png");

    }
    public void show(){
        Gdx.input.setInputProcessor(stage);
        Drawable nextd = new TextureRegionDrawable(nextbutton);
        ImageButton nextbutton = new ImageButton(nextd);
        nextbutton.setPosition(600,30);
        nextbutton.setSize(150,50);
        nextbutton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                if (current_level instanceof Level1)
                    game.setScreen(new Level2(game));
                else if (current_level instanceof Level2)
                    game.setScreen(new Level3(game));
                else if (current_level instanceof Level3)
                    game.setScreen(new SelectLevelScreen(game));
            }
        });

        Drawable exitd = new TextureRegionDrawable(exitbutton);
        ImageButton exitbutton = new ImageButton(exitd);
        exitbutton.setPosition(100,30);
        exitbutton.setSize(150,50);
        exitbutton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new MainMenuScreen(game));
            }
        });

        stage.addActor(nextbutton);
        stage.addActor(exitbutton);
    }
    public void render(float delta){
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(winbackground, 0,0,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.draw(exitbutton,100,30,150,50);
//        batch.draw(nextbutton,600,30,150,50);
        batch.end();

        stage.act();
        stage.draw();


//        if(Gdx.input.isTouched()){
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
//            if (touchX >= 100 && touchX <= 250 && touchY >= 30 && touchY <= 80){
//                game.setScreen(new MainMenuScreen(game));
//            }
//            if (touchX >= 600 && touchX <= 750 && touchY >= 30 && touchY <= 80){
//                game.setScreen(new Level2(game));
//            }
//
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
        winbackground.dispose();
        nextbutton.dispose();
        exitbutton.dispose();
    }
}
