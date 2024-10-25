package com.BirdsAngry;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
//    public SpriteBatch batch;
    private Music backgroudnmusic;

    @Override
    public void create() {
        backgroudnmusic = Gdx.audio.newMusic(Gdx.files.internal("backgroundmusic.mp3"));
        backgroudnmusic.setLooping(true);
        backgroudnmusic.play();
//        batch = new SpriteBatch();
        this.setScreen(new LoadingScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
//        batch.dispose();
    }
}
