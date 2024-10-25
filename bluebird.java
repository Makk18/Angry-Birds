package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;

public class bluebird extends Birds{
    private String name;
    private int posx;
    private int posy;
    private int width;
    private int height;
    private int velocity;
    private Texture bluebird;

    public bluebird(String name, int posx,int posy, int velocity, int width, int height) {
        super(name,posx,posy,velocity,width,height);
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.velocity = velocity;
        bluebird= new Texture("bluebird.png");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPosx(){
        return posx;
    }
    @Override
    public int getPosy(){
        return posy;
    }
    @Override
    public int getBirdVelocity() {
        return velocity;
    }
    @Override
    public int getWidth(){
        return width;
    }
    @Override
    public int getHeight(){
        return height;
    }

    @Override
    public Texture getBirdTexture() {
        return bluebird;
    }
}
//    public void split(){
//        // Split into 3 birds
//    }




